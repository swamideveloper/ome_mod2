package com.omegirl.videochat.pro.scorpio;

import static com.omegirl.videochat.pro.scorpio.fdkfjdjkhduv102120120.incoming_counter;
import static com.omegirl.videochat.pro.scorpio.fdkfjdjkhduv102120120.isVectorShow;
import static com.omegirl.videochat.pro.harrier.disdusyd0909607960.native_ShowAds;
import static com.omegirl.videochat.pro.mustang.fndjknfjdnfjk20120101010.connectInComing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.qurekalite.predchampp.cnxbv87r5t7tffgsg;
import com.qurekalite.predchampp.dog.dddd01d540d5d40;
import com.omegirl.videochat.pro.R;
import com.omegirl.videochat.pro.audi.bxhvbxcjhvb01210210;

public class dsjhdfuifhuidf1120120101 extends AppCompatActivity {

    LinearLayout guide_1, guide_2, guide_3, guide_4, guide_5, guide_6, guide_7, guide_8, guide_9, guide_0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

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

        init();

        guide_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(dsjhdfuifhuidf1120120101.this, bxhvbxcjhvb01210210.class));
            }
        });

        guide_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next(1);
            }
        });
        guide_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next(2);
            }
        });
        guide_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next(3);
            }
        });
        guide_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next(4);
            }
        });
        guide_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next(5);
            }
        });
        guide_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next(6);
            }
        });
        guide_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next(7);
            }
        });
        guide_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next(8);
            }
        });
    }

    public void init() {
        guide_1 = findViewById(R.id.guide_1);
        guide_2 = findViewById(R.id.guide_2);
        guide_3 = findViewById(R.id.guide_3);
        guide_4 = findViewById(R.id.guide_4);
        guide_5 = findViewById(R.id.guide_5);
        guide_6 = findViewById(R.id.guide_6);
        guide_7 = findViewById(R.id.guide_7);
        guide_8 = findViewById(R.id.guide_8);
        guide_9 = findViewById(R.id.guide_1);
        guide_0 = findViewById(R.id.guide_0);
    }

    public void next(int count) {
        if (new dddd01d540d5d40(dsjhdfuifhuidf1120120101.this).getIncoming_Counter().equalsIgnoreCase(String.valueOf(incoming_counter))) {
            connectInComing(dsjhdfuifhuidf1120120101.this);
        } else {
            Intent intent = new Intent(dsjhdfuifhuidf1120120101.this, fndjkfduifhduinf12012010.class);
            intent.putExtra("counter", count);
            startActivity(intent);
        }
    }

    @Override
    public void onBackPressed() {
        cnxbv87r5t7tffgsg.ShowInterstitialAdsOnBack(this);
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (!isVectorShow) {
            ((ImageView) findViewById(R.id.vector_pro)).setVisibility(View.GONE);
        }

        if (new dddd01d540d5d40(this).getKeyOnresumenativeshow().equals("1")) {
            native_ShowAds(this, findViewById(R.id.native_container), 2);
        }
    }
}