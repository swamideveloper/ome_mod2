package com.qurekalite.predchampp;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.qurekalite.predchampp.bat.bhdbfhdbfh122020;
import com.qurekalite.predchampp.bat.bbbgbgbgb04105;
import com.qurekalite.predchampp.bat.bhbhbhbhbbhbhdb1354;
import com.qurekalite.predchampp.dog.dddd01d540d5d40;
import com.facebook.ads.AudienceNetworkAds;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;


public class cnxbvdfy7idyfdfd51f4 {

    private static cnxbvdfy7idyfdfd51f4 instance;

    public static cnxbvdfy7idyfdfd51f4 getManager() {
        if (instance == null) {
            instance = new cnxbvdfy7idyfdfd51f4();
        }
        return instance;
    }

    public void initialize(Application mContext, Class<?> splashClass) {
        MobileAds.initialize(mContext.getApplicationContext(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        AudienceNetworkAds.initialize(mContext);
        new bbbgbgbgb04105(mContext, splashClass);
    }

    public static boolean isOnline(Activity activity) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) activity.getSystemService(Context.CONNECTIVITY_SERVICE)).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    public void preLoadAds(Activity activity) {

        if (!new dddd01d540d5d40(activity).getAdmobInterstitialID().isEmpty() ) {

            if (!new dddd01d540d5d40(activity).getAdmobInterStatus().equals("0")) {
                bhbhbhbhbbhbhdb1354.getManager(activity).loadAd(activity,true);
            }

            if (!new dddd01d540d5d40(activity).getAdmobInterStatus().equals("0")) {
                bhbhbhbhbbhbhdb1354.getManager(activity).loadBackAd(activity);
            }
        }

        if (!new dddd01d540d5d40(activity).getAdmobNative().equals("0") &&
                !new dddd01d540d5d40(activity).getAdmobNativeID().isEmpty()) {
            bhdbfhdbfh122020.getInstance(activity).preLoadNativeAds(activity,0);
        }
    }
}
