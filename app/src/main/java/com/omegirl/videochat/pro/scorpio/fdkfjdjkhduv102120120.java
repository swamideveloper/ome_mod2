package com.omegirl.videochat.pro.scorpio;

import static com.omegirl.videochat.pro.harrier.disdusyd0909607960.native_ShowAds;
import static com.omegirl.videochat.pro.mustang.fndjknfjdnfjk20120101010.connectInComing;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.qurekalite.predchampp.cnxbv87r5t7tffgsg;
import com.qurekalite.predchampp.dog.dddd01d540d5d40;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.DexterError;
import com.karumi.dexter.listener.PermissionRequestErrorListener;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;
import com.omegirl.videochat.pro.R;
import com.omegirl.videochat.pro.dfjsbdjkfd10640685;
import com.omegirl.videochat.pro.audi.bxhvbxcjhvb01210210;
import com.omegirl.videochat.pro.mustang.uhsdfiffhud02101201010;

import java.util.List;


public class fdkfjdjkhduv102120120 extends AppCompatActivity {

    public static boolean isVectorShow = true;
    private AppCompatButton welcome;

    //incoming call
    public static int incoming_counter = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        
        dfjsbdjkfd10640685.changeVectorStatus(this);

        if (new uhsdfiffhud02101201010().isTerms() && new dddd01d540d5d40(fdkfjdjkhduv102120120.this).getKeyTermscreen().equals("1")) {
            new uhsdfiffhud02101201010().stopTerms();
            cnxbv87r5t7tffgsg.ShowInterstitialAdsOnCreate(this);
        }


        if (new dddd01d540d5d40(this).getKeyOnresumenativeshow().equals("0")) {
            native_ShowAds(this, findViewById(R.id.native_container), 1);
        }


        welcome = findViewById(R.id.welcome);


        welcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                requestPR();
            }
        });

    }

    private void goNextScreen() {
        if (new dddd01d540d5d40(fdkfjdjkhduv102120120.this).getIncoming_Welcome().equalsIgnoreCase("1") && incoming_counter == -1) {
            connectInComing(fdkfjdjkhduv102120120.this);
        } else {
            if (new dddd01d540d5d40(fdkfjdjkhduv102120120.this).getIncoming_Counter().equalsIgnoreCase(String.valueOf(incoming_counter))) {
                connectInComing(fdkfjdjkhduv102120120.this);
            } else {
                if (new dddd01d540d5d40(fdkfjdjkhduv102120120.this).getIsLongApp().equalsIgnoreCase("1")) {
                    startActivity(new Intent(fdkfjdjkhduv102120120.this, fbdbfdbnk102012010.class));
                } else {
                    startActivity(new Intent(fdkfjdjkhduv102120120.this, bxhvbxcjhvb01210210.class));
                }
            }
        }
    }


    @Override
    public void onBackPressed() {
        if (new dddd01d540d5d40(this).getKeyExitscreen().equals("1")) {
            startActivity(new Intent(fdkfjdjkhduv102120120.this, fnjdkhfudibhfudnl152012010.class).putExtra("issplash", 1));
        } else {
            tagAgainToExit();
        }
    }


    boolean doubleBackToExitPressedOnce = false;

    private void tagAgainToExit() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }


    private void requestPR() {

        Dexter.withActivity(fdkfjdjkhduv102120120.this).withPermissions(Manifest.permission.CAMERA).withListener(new MultiplePermissionsListener() {
            @Override
            public void onPermissionsChecked(MultiplePermissionsReport report) {
                if (report.areAllPermissionsGranted()) {
                    goNextScreen();
                } else if (report.isAnyPermissionPermanentlyDenied()) {
                    showSettingsDialog();
                }
            }

            @Override
            public void onPermissionRationaleShouldBeShown(List permissions, PermissionToken token) {
                token.continuePermissionRequest();
            }
        }).withErrorListener(new PermissionRequestErrorListener() {
            @Override
            public void onError(DexterError error) {
                Toast.makeText(getApplicationContext(), "Error" + error.toString(), Toast.LENGTH_SHORT).show();
            }
        }).onSameThread().check();

    }

    private void showSettingsDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(fdkfjdjkhduv102120120.this, R.style.Theme_Dllg);
        builder.setTitle("Need Permissions");
        builder.setMessage("This App needs CAMERA Permission to Use Video Call Feature. You can Grant them in App iioiiii0235.");
        builder.setPositiveButton("GOTO SETTINGS", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
                openSettings();
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder.show();
    }

    private void openSettings() {
        Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
        Uri uri = Uri.fromParts("package", getPackageName(), null);
        intent.setData(uri);
        startActivityForResult(intent, 101);
    }
}