// Generated by view binder compiler. Do not edit!
package com.argostock.capstoneapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.argostock.capstoneapp.R;
import com.google.android.material.switchmaterial.SwitchMaterial;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final ConstraintLayout linearLayout2;

  @NonNull
  public final SwitchMaterial mode;

  @NonNull
  public final CardView offlineScanner;

  @NonNull
  public final Button signOutBtn;

  @NonNull
  public final ImageView textAgro;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout linearLayout2,
      @NonNull SwitchMaterial mode, @NonNull CardView offlineScanner, @NonNull Button signOutBtn,
      @NonNull ImageView textAgro) {
    this.rootView = rootView;
    this.constraintLayout = constraintLayout;
    this.linearLayout2 = linearLayout2;
    this.mode = mode;
    this.offlineScanner = offlineScanner;
    this.signOutBtn = signOutBtn;
    this.textAgro = textAgro;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.constraintLayout;
      ConstraintLayout constraintLayout = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout == null) {
        break missingId;
      }

      id = R.id.linearLayout2;
      ConstraintLayout linearLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout2 == null) {
        break missingId;
      }

      id = R.id.mode;
      SwitchMaterial mode = ViewBindings.findChildViewById(rootView, id);
      if (mode == null) {
        break missingId;
      }

      id = R.id.offline_scanner;
      CardView offlineScanner = ViewBindings.findChildViewById(rootView, id);
      if (offlineScanner == null) {
        break missingId;
      }

      id = R.id.sign_out_btn;
      Button signOutBtn = ViewBindings.findChildViewById(rootView, id);
      if (signOutBtn == null) {
        break missingId;
      }

      id = R.id.textAgro;
      ImageView textAgro = ViewBindings.findChildViewById(rootView, id);
      if (textAgro == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, constraintLayout, linearLayout2,
          mode, offlineScanner, signOutBtn, textAgro);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
