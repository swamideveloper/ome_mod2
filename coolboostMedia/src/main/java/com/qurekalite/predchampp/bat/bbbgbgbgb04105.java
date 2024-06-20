package com.qurekalite.predchampp.bat;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;

import com.qurekalite.predchampp.dog.dddsdsd0s5d4;
import com.qurekalite.predchampp.dog.dddd01d540d5d40;


public class bbbgbgbgb04105 implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {
    private Activity currentActivity;
    private Class<?> splashClass;
    private static final String TAG = "bbbgbgbgb04105";

    bdhubfd67fdft appOpenLoader;

    public bbbgbgbgb04105(Application application, Class<?> aClass) {
        splashClass = aClass;
        application.registerActivityLifecycleCallbacks(this);
        ProcessLifecycleOwner.get().getLifecycle().addObserver(this);
        appOpenLoader = new bdhubfd67fdft();
    }

    @Override
    public void onStart(@NonNull LifecycleOwner owner) {
        DefaultLifecycleObserver.super.onStart(owner);

        if (dddsdsd0s5d4.isNetworkAvailable(currentActivity) && new dddd01d540d5d40(currentActivity).getAdsFlag() && !new dddd01d540d5d40(currentActivity).getAdmobAppOpenID().isEmpty() &&!currentActivity.getClass().getSimpleName().equals("Activity_ScanQRCode")) {
            appOpenLoader.showAdIfAvailable(currentActivity, splashClass);
        }
    }

    @Override
    public void onDestroy(@NonNull LifecycleOwner owner) {
        DefaultLifecycleObserver.super.onDestroy(owner);
    }

    @Override
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {

    }

    @Override
    public void onActivityStarted(@NonNull Activity activity) {
        currentActivity = activity;
    }

    @Override
    public void onActivityResumed(@NonNull Activity activity) {

    }

    @Override
    public void onActivityPaused(@NonNull Activity activity) {

    }

    @Override
    public void onActivityStopped(@NonNull Activity activity) {

    }

    @Override
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {

    }

    @Override
    public void onActivityDestroyed(@NonNull Activity activity) {

    }

}
