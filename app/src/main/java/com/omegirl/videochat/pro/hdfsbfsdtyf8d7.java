package com.omegirl.videochat.pro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.qurekalite.predchampp.cnxbv87r5t7tffgsg;
import com.omegirl.videochat.pro.scorpio.fdkfjdjkhduv102120120;

public class hdfsbfsdtyf8d7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_policy2);

        cnxbv87r5t7tffgsg.ShowInterstitialAdsOnCreate(this);

        findViewById(R.id.tv_next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(hdfsbfsdtyf8d7.this, fdkfjdjkhduv102120120.class).putExtra("issplash", 2));
                finish();
            }
        });

        findViewById(R.id.tv_decline).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


    }

    @Override
    public void onBackPressed() {
    }
}