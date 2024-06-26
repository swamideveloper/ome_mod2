package com.qurekalite.predchampp.dog;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;

public class ddddfdfd54d0f54df504d {

    private static final int NOTIFICATION_ID = 1;
    private static ddddfdfd54d0f54df504d manager;

    Context mActivity;

    public static ddddfdfd54d0f54df504d getInstance(Context activity) {
        if (manager == null) {
            manager = new ddddfdfd54d0f54df504d(activity);
        }
        return manager;
    }

    public ddddfdfd54d0f54df504d(Context activity) {
        this.mActivity = activity;
    }

    public void clearNotification(){
        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(mActivity);
        notificationManager.cancel(NOTIFICATION_ID);
    }

    private Boolean checkPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (ContextCompat.checkSelfPermission(mActivity, Manifest.permission.POST_NOTIFICATIONS) ==
                    PackageManager.PERMISSION_GRANTED) {
                return true;
            }
            ActivityCompat.requestPermissions((Activity) mActivity, new String[]{Manifest.permission.POST_NOTIFICATIONS}, 30);
            return false;
        }
        return true;
    }
}
