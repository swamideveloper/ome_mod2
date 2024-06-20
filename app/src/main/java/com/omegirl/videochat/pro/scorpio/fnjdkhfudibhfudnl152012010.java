package com.omegirl.videochat.pro.scorpio;

import static com.omegirl.videochat.pro.harrier.disdusyd0909607960.native_ShowAds;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.qurekalite.predchampp.cnxbv87r5t7tffgsg;
import com.qurekalite.predchampp.dog.dddd01d540d5d40;
import com.omegirl.videochat.pro.R;


public class fnjdkhfudibhfudnl152012010 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thankyou);


        dddd01d540d5d40.show_Gift(this, (RelativeLayout) findViewById(R.id.rl_anim_header));

        cnxbv87r5t7tffgsg.ShowInterstitialAdsOnCreate(this);
        if (new dddd01d540d5d40(this).getKeyOnresumenativeshow().equals("0")) {
            native_ShowAds(this, findViewById(R.id.native_container), 1);
        }

        findViewById(R.id.llYes).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });

        findViewById(R.id.llNo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }

    @Override
    public void onBackPressed() {
        cnxbv87r5t7tffgsg.ShowInterstitialAdsOnBack(this);
    }
}