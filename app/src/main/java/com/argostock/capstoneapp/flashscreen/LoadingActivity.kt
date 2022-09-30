package com.argostock.capstoneapp.flashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.argostock.capstoneapp.MainActivity
import com.argostock.capstoneapp.R


@Suppress("DEPRECATION")
class LoadingActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading)


        Handler().postDelayed({
                val dashboardIntent = Intent(this, MainActivity::class.java)
                startActivity(dashboardIntent)
                finish()
        }, 2000)
    }
}