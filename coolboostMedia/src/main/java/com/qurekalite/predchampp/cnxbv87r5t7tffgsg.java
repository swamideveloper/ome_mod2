package com.qurekalite.predchampp;

import static com.qurekalite.predchampp.dog.dddd01d540d5d40.app_back_count_click;
import static com.qurekalite.predchampp.dog.dddd01d540d5d40.app_combo_counter;
import static com.qurekalite.predchampp.dog.dddd01d540d5d40.app_count_click;
import static com.qurekalite.predchampp.dog.dddd01d540d5d40.isComboActive;

import android.app.Activity;

import com.qurekalite.predchampp.bat.bhbhbhbhbbhbhdb1354;
import com.qurekalite.predchampp.dog.dddd01d540d5d40;
import com.qurekalite.predchampp.elephant.eereeeeeeee1021;

public class cnxbv87r5t7tffgsg {

    public static void ShowInterstitialAdsOnCreate(Activity activity) {

        if (isComboActive) {
            if (app_combo_counter == Integer.parseInt(new dddd01d540d5d40(activity).getComboCount())) {
                callingInter(activity);
                app_combo_counter = 0;
            } else {
                app_combo_counter = app_combo_counter + 1;
            }
        } else {
            callingInter(activity);
        }


    }

    private static void callingInter(Activity activity) {
        bhbhbhbhbbhbhdb1354.getManager(activity).showInterAd(activity, new eereeeeeeee1021() {
            @Override
            public void onShowAdComplete() {
                bhbhbhbhbbhbhdb1354.getManager(activity).showFacebookAds(activity);
            }
        }, app_count_click);
    }



    public static void ShowInterstitialAdsOnBack(Activity activity) {
        bhbhbhbhbbhbhdb1354.getManager(activity).ShowInterBackAd(activity, new eereeeeeeee1021() {
            @Override
            public void onShowAdComplete() {
                activity.finish();
            }
        }, app_back_count_click);
    }
}