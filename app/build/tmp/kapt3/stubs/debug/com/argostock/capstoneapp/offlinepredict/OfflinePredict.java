package com.argostock.capstoneapp.offlinepredict;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u00a2\u0006\u0002\u0010\u0011J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u001a\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0013H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/argostock/capstoneapp/offlinepredict/OfflinePredict;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "REQUEST_CODE_GALLERY", "", "binding", "Lcom/argostock/capstoneapp/databinding/ActivityOfflinePredictBinding;", "currentPhotoPath", "", "launcherIntentCamera", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "onResult", "getMax", "arr", "", "([F)Ljava/lang/Integer;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResultReceived", "requestCode", "result", "Landroidx/activity/result/ActivityResult;", "predictImage", "bitmap", "Landroid/graphics/Bitmap;", "startTakePhoto", "app_debug"})
public final class OfflinePredict extends androidx.appcompat.app.AppCompatActivity {
    private com.argostock.capstoneapp.databinding.ActivityOfflinePredictBinding binding;
    private java.lang.String currentPhotoPath;
    private final int REQUEST_CODE_GALLERY = 102;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> onResult = null;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> launcherIntentCamera = null;
    private java.util.HashMap _$_findViewCache;
    
    public OfflinePredict() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void startTakePhoto() {
    }
    
    private final void onResultReceived(int requestCode, androidx.activity.result.ActivityResult result) {
    }
    
    private final void predictImage(android.graphics.Bitmap bitmap) {
    }
    
    private final java.lang.Integer getMax(float[] arr) {
        return null;
    }
}