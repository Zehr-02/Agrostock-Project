// Generated by view binder compiler. Do not edit!
package com.argostock.capstoneapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.argostock.capstoneapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityOfflinePredictBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonCaptureOffline;

  @NonNull
  public final Button buttonTestCapture;

  @NonNull
  public final CardView cardViewOffline;

  @NonNull
  public final ImageView imagePreviewOffline;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final ImageView imgPreviewSampleOffline;

  @NonNull
  public final TextView textActionOffline;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final TextView tvResultOffline;

  @NonNull
  public final TextView tvResultPredictOffline;

  private ActivityOfflinePredictBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button buttonCaptureOffline, @NonNull Button buttonTestCapture,
      @NonNull CardView cardViewOffline, @NonNull ImageView imagePreviewOffline,
      @NonNull ImageView imageView3, @NonNull ImageView imgPreviewSampleOffline,
      @NonNull TextView textActionOffline, @NonNull Toolbar toolbar,
      @NonNull TextView tvResultOffline, @NonNull TextView tvResultPredictOffline) {
    this.rootView = rootView;
    this.buttonCaptureOffline = buttonCaptureOffline;
    this.buttonTestCapture = buttonTestCapture;
    this.cardViewOffline = cardViewOffline;
    this.imagePreviewOffline = imagePreviewOffline;
    this.imageView3 = imageView3;
    this.imgPreviewSampleOffline = imgPreviewSampleOffline;
    this.textActionOffline = textActionOffline;
    this.toolbar = toolbar;
    this.tvResultOffline = tvResultOffline;
    this.tvResultPredictOffline = tvResultPredictOffline;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityOfflinePredictBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityOfflinePredictBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_offline_predict, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityOfflinePredictBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_capture_offline;
      Button buttonCaptureOffline = ViewBindings.findChildViewById(rootView, id);
      if (buttonCaptureOffline == null) {
        break missingId;
      }

      id = R.id.button_test_capture;
      Button buttonTestCapture = ViewBindings.findChildViewById(rootView, id);
      if (buttonTestCapture == null) {
        break missingId;
      }

      id = R.id.cardView_offline;
      CardView cardViewOffline = ViewBindings.findChildViewById(rootView, id);
      if (cardViewOffline == null) {
        break missingId;
      }

      id = R.id.image_preview_offline;
      ImageView imagePreviewOffline = ViewBindings.findChildViewById(rootView, id);
      if (imagePreviewOffline == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.img_preview_sample_offline;
      ImageView imgPreviewSampleOffline = ViewBindings.findChildViewById(rootView, id);
      if (imgPreviewSampleOffline == null) {
        break missingId;
      }

      id = R.id.text_action_offline;
      TextView textActionOffline = ViewBindings.findChildViewById(rootView, id);
      if (textActionOffline == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.tv_result_offline;
      TextView tvResultOffline = ViewBindings.findChildViewById(rootView, id);
      if (tvResultOffline == null) {
        break missingId;
      }

      id = R.id.tv_result_predict_offline;
      TextView tvResultPredictOffline = ViewBindings.findChildViewById(rootView, id);
      if (tvResultPredictOffline == null) {
        break missingId;
      }

      return new ActivityOfflinePredictBinding((ConstraintLayout) rootView, buttonCaptureOffline,
          buttonTestCapture, cardViewOffline, imagePreviewOffline, imageView3,
          imgPreviewSampleOffline, textActionOffline, toolbar, tvResultOffline,
          tvResultPredictOffline);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
