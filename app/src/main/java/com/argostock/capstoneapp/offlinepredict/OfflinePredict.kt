package com.argostock.capstoneapp.offlinepredict

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.view.View
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.FileProvider
import com.argostock.capstoneapp.databinding.ActivityOfflinePredictBinding
import com.argostock.capstoneapp.ml.Model
import org.tensorflow.lite.DataType
import org.tensorflow.lite.support.image.ImageProcessor
import org.tensorflow.lite.support.image.TensorImage
import org.tensorflow.lite.support.image.ops.ResizeOp
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer
import java.io.File

class OfflinePredict : AppCompatActivity() {
    private lateinit var binding: ActivityOfflinePredictBinding
    private lateinit var currentPhotoPath: String

    private val REQUEST_CODE_GALLERY = 102

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOfflinePredictBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbar.setNavigationOnClickListener { onBackPressed() }

        binding.apply {
            buttonCaptureOffline.setOnClickListener {
                val intent =
                    Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
                intent.type = "image/*"
                val mimeTypes = arrayOf("image/jpeg", "image/jpg", "image/png")
                intent.putExtra(Intent.EXTRA_MIME_TYPES, mimeTypes)
                intent.flags = Intent.FLAG_GRANT_READ_URI_PERMISSION
                onResult.launch(intent)
            }

            buttonTestCapture.setOnClickListener {
                startTakePhoto()
            }
        }
    }

    private fun startTakePhoto() {
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        intent.resolveActivity(packageManager)

        createCustomTempFile(application).also {
            val photoURI: Uri = FileProvider.getUriForFile(
                this@OfflinePredict,
                "com.argostock.capstoneapp",
                it
            )
            currentPhotoPath = it.absolutePath
            intent.putExtra(MediaStore.EXTRA_OUTPUT, photoURI)
            launcherIntentCamera.launch(intent)
        }
    }

    private val onResult =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult())
        { result ->
            Log.i("TAG", "This is the result: ${result.data} ${result.resultCode}")
            onResultReceived(REQUEST_CODE_GALLERY, result)
        }

    private fun onResultReceived(requestCode: Int, result: ActivityResult?) {
        when (requestCode) {
            REQUEST_CODE_GALLERY -> {
                if (result?.resultCode == RESULT_OK) {
                    result.data?.data?.let { uri ->
                        Log.i("TAG", "onresultReceived: $uri")
                        val bitmap =
                            BitmapFactory.decodeStream(contentResolver.openInputStream(uri))
                        binding.apply {
                            imgPreviewSampleOffline.visibility = View.GONE
                            imagePreviewOffline.visibility = View.VISIBLE
                            imagePreviewOffline.setImageBitmap(bitmap)
                            imagePreviewOffline.rotation = 90f
                            predictImage(bitmap)
                            tvResultOffline.visibility = View.VISIBLE
                            tvResultPredictOffline.visibility = View.VISIBLE
                        }
                    }
                } else {
                    Log.e("TAG", "onActivityResult: Error selecting image")
                }
            }

        }
    }

    private fun predictImage(bitmap: Bitmap) {

        val imageProcessor = ImageProcessor.Builder()
            .add(ResizeOp(150, 150, ResizeOp.ResizeMethod.BILINEAR))
            .build()
        val model = Model.newInstance(this)
        val tensorImage = TensorImage(DataType.FLOAT32)
        tensorImage.load(bitmap)
        val newTensorImage = imageProcessor.process(tensorImage)
        val byteBuffer = newTensorImage.buffer

// Creates inputs for reference.
        val inputFeature0 =
            TensorBuffer.createFixedSize(intArrayOf(1, 150, 150, 3), DataType.FLOAT32)
        inputFeature0.loadBuffer(byteBuffer)

// Runs model inference and gets result.
        val outputs = model.process(inputFeature0)
        val outputFeature0 = outputs.outputFeature0AsTensorBuffer

        val max = getMax(outputFeature0.floatArray)
        var offlineOutput = ""
        if (max == 0) {
            offlineOutput = "Fresh Apple"
        } else if (max == 1) {
            offlineOutput = "Fresh Banana"
        } else if (max == 2) {
            offlineOutput = "Fresh Bitter Gourd"
        } else if (max == 3) {
            offlineOutput = "Fresh Capsicum"
        } else if (max == 4) {
            offlineOutput = "Fresh Orange"
        } else if (max == 5) {
            offlineOutput = "Fresh Tomato"
        } else if (max == 6) {
            offlineOutput = "Rotten Apple"
        } else if (max == 7) {
            offlineOutput = "Rotten Banana"
        } else if (max == 8) {
            offlineOutput = "Rotten Bitter Gourd"
        } else if (max == 9) {
            offlineOutput = "Rotten Capsicum"
        } else if (max == 10) {
            offlineOutput = "Rotten Orange"
        } else if (max == 11) {
            offlineOutput = "Rotten Tomato"
        } else {
            offlineOutput = "Not Sure..."
        }

        binding.tvResultPredictOffline.text = offlineOutput

// Releases model resources if no longer used.
        model.close()
    }

    private fun getMax(arr: FloatArray): Int? {
        var index = 12
        val min = 0.75f

        for (i in 0..11) {
            if (arr[i] >= min) {
                index = i
            }
        }

        if (index == 12) {
            return index
        } else {
            return arr.maxOrNull()?.let { arr.indexOfFirst { it == it } }
        }
    }

    private val launcherIntentCamera = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) {
        if (it.resultCode == RESULT_OK) {
            val myFile = File(currentPhotoPath)

            val result = BitmapFactory.decodeFile(myFile.path)
            binding.apply {
                imgPreviewSampleOffline.visibility = View.GONE
                imagePreviewOffline.visibility = View.VISIBLE
                imagePreviewOffline.setImageBitmap(result)
                imagePreviewOffline.rotation = 90f
                predictImage(result)
                tvResultOffline.visibility = View.VISIBLE
                tvResultPredictOffline.visibility = View.VISIBLE
            }
        }
    }

}

