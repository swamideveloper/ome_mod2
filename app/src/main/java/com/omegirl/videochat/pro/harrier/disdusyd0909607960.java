package com.omegirl.videochat.pro.harrier;

import static com.qurekalite.predchampp.dog.dddd01d540d5d40.app_count_click;

import android.app.Activity;
import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.StrictMode;
import android.preference.PreferenceManager;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.qurekalite.predchampp.cnxbvdfy7idyfdfd51f4;
import com.qurekalite.predchampp.bat.bhdbfhdbfh122020;
import com.omegirl.videochat.pro.R;
import com.omegirl.videochat.pro.mustang.uhsdfiffhud02101201010;

import java.util.Date;

public class disdusyd0909607960 extends Application {
    private static final String FIRST_LAUNCH = "FIRST_LAUNCH";
    private static Context context = null;
    private static disdusyd0909607960 instance_app_data = null;

    public static final String CHANEL_ID = "Video Call";


    private disdusyd0909607960 mInstance;

    private void createNotificationChangel() {
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(new NotificationChannel(CHANEL_ID, getResources().getString(R.string.app_name), NotificationManager.IMPORTANCE_DEFAULT));
        }
    }

    public static boolean isNetworkConnected(Activity activity) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) activity.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    public static void native_ShowAds(Activity activity, ViewGroup viewGroup, int Type) {
        if (Type == 1) {
            bhdbfhdbfh122020.getInstance(activity).show_native_AD(activity, viewGroup, 1, app_count_click);
        } else {
            bhdbfhdbfh122020.getInstance(activity).show_native_AD(activity, viewGroup, 2, app_count_click);
        }
    }


    public static Context getContext() {
        return context;
    }

    public static disdusyd0909607960 getInstance() {
        return instance_app_data;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        setFirstLaunch(this);
        context = getApplicationContext();
        instance_app_data = this;

        if (Build.VERSION.SDK_INT >= 24) {
            try {
                StrictMode.class.getMethod("disableDeathOnFileUriExposure", new Class[0]).invoke((Object) null, new Object[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        mInstance = this;

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            if (!getPackageName().equals(Application.getProcessName())) {
                WebView.setDataDirectorySuffix(Application.getProcessName());
            }
        }

        createNotificationChangel();
        cnxbvdfy7idyfdfd51f4.getManager().initialize(this, fmdklfjd021021201.class);

        //onetime
        uhsdfiffhud02101201010.initializingSharedPreference(context);
    }


    private static void setFirstLaunch(Context context2) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context2.getApplicationContext());
        if (!defaultSharedPreferences.contains(FIRST_LAUNCH)) {
            defaultSharedPreferences.edit().putLong(FIRST_LAUNCH, new Date().getTime()).apply();
        }
    }


}