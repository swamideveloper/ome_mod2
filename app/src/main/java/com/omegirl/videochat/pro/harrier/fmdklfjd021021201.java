package com.omegirl.videochat.pro.harrier;

import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

import com.qurekalite.predchampp.dog.dddd01d540d5d40;
import com.qurekalite.predchampp.cnxbvf35d1fd85fd8;
import com.omegirl.videochat.pro.BuildConfig;
import com.omegirl.videochat.pro.R;
import com.omegirl.videochat.pro.uidshuhfuis76s78d6s789d;
import com.omegirl.videochat.pro.mustang.uhsdfiffhud02101201010;
import com.omegirl.videochat.pro.scorpio.fdkfjdjkhduv102120120;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

public class fmdklfjd021021201 extends cnxbvf35d1fd85fd8 {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_splash);

        //fb app-install
        FacebookSdk.setApplicationId("479346487821763");
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (checkSelfPermission(Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
                requestPermissions(new String[]{Manifest.permission.POST_NOTIFICATIONS}, 101);
                return;
            } else {
                loadSplash(BuildConfig.DEBUG, BuildConfig.VERSION_CODE);
            }
        } else {
            loadSplash(BuildConfig.DEBUG, BuildConfig.VERSION_CODE);
        }
    }


    @Override
    public void onComplete() {

        manageVip();

        if (new dddd01d540d5d40(this).getKeyTermscreen().equals("1")) {
            if (new uhsdfiffhud02101201010().isTerms()) {
                startActivity(new Intent(fmdklfjd021021201.this, uidshuhfuis76s78d6s789d.class).putExtra("issplash", 1));
            } else {
                startActivity(new Intent(fmdklfjd021021201.this, fdkfjdjkhduv102120120.class).putExtra("issplash", 1));
            }
        } else {
            startActivity(new Intent(fmdklfjd021021201.this, fdkfjdjkhduv102120120.class).putExtra("issplash", 1));
        }
        finish();

    }

    private void manageVip() {

        if (new uhsdfiffhud02101201010().getVipType().equals("in_app_gold")) {
            new dddd01d540d5d40(this).redeemGoldPlan();
//            new dddd01d540d5d40(this).setAdsFlag(false);
//            new dddd01d540d5d40(this).set_IncomingWelcome_Fix();
        } else if (new uhsdfiffhud02101201010().getVipType().equals("in_app_silver")) {
            new dddd01d540d5d40(this).redeemSilverPlan();
        } else if (new uhsdfiffhud02101201010().getVipType().equals("in_app_bronze")) {
            new dddd01d540d5d40(this).redeemBronzePlan();
            SharedPreferences sh = getSharedPreferences("RandomSF", MODE_APPEND);
            int vc_count = sh.getInt("KEY_RAND", 0);
            if (vc_count == 7) {
                new uhsdfiffhud02101201010().setVipType("null");
                Toast.makeText(this, "Bronze Premium Expire! You reached your call limit.", Toast.LENGTH_LONG).show();
            }
        }
    }

    @Override
    public void onBackPressed() {
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            switch (requestCode) {
                case 101: {
                    if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                        loadSplash(BuildConfig.DEBUG, BuildConfig.VERSION_CODE);
                    } else {
                        loadSplash(BuildConfig.DEBUG, BuildConfig.VERSION_CODE);
                    }
                    return;
                }
            }
        }
    }


}
