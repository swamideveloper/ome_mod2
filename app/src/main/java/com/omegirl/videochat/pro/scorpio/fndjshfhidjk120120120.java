package com.omegirl.videochat.pro.scorpio;

import static com.omegirl.videochat.pro.scorpio.fdkfjdjkhduv102120120.incoming_counter;
import static com.omegirl.videochat.pro.harrier.disdusyd0909607960.native_ShowAds;
import static com.omegirl.videochat.pro.mustang.fndjknfjdnfjk20120101010.connectInComing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.qurekalite.predchampp.cnxbv87r5t7tffgsg;
import com.qurekalite.predchampp.dog.dddd01d540d5d40;
import com.omegirl.videochat.pro.R;

public class fndjshfhidjk120120120 extends AppCompatActivity {

    LinearLayout videocall, videocall_advice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_types);

        findViewById(R.id.img_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        incoming_counter++;

        dddd01d540d5d40.show_anim_header(this, (RelativeLayout) findViewById(R.id.rl_anim_header));
        cnxbv87r5t7tffgsg.ShowInterstitialAdsOnCreate(this);
        if (new dddd01d540d5d40(this).getKeyOnresumenativeshow().equals("0")) {
            native_ShowAds(this, findViewById(R.id.native_container), 2);
        }


        videocall = findViewById(R.id.videocall);
        videocall_advice = findViewById(R.id.videocall_advice);

        videocall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (new dddd01d540d5d40(fndjshfhidjk120120120.this).getIncoming_Counter().equalsIgnoreCase(String.valueOf(incoming_counter))) {
                    connectInComing(fndjshfhidjk120120120.this);
                } else {
                    startActivity(new Intent(fndjshfhidjk120120120.this, fbdbhfudybfk12012010.class));
                }
            }
        });


        videocall_advice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (new dddd01d540d5d40(fndjshfhidjk120120120.this).getIncoming_Counter().equalsIgnoreCase(String.valueOf(incoming_counter))) {
                    connectInComing(fndjshfhidjk120120120.this);
                } else {
                    startActivity(new Intent(fndjshfhidjk120120120.this, dsjhdfuifhuidf1120120101.class));
                }
            }
        });
    }


    @Override
    public void onBackPressed() {
        cnxbv87r5t7tffgsg.ShowInterstitialAdsOnBack(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (new dddd01d540d5d40(this).getKeyOnresumenativeshow().equals("1")) {
            native_ShowAds(this, findViewById(R.id.native_container), 2);
        }
    }
}