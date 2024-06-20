package com.omegirl.videochat.pro.scorpio;

import static com.omegirl.videochat.pro.scorpio.fdkfjdjkhduv102120120.incoming_counter;
import static com.omegirl.videochat.pro.scorpio.fdkfjdjkhduv102120120.isVectorShow;
import static com.omegirl.videochat.pro.harrier.disdusyd0909607960.native_ShowAds;
import static com.omegirl.videochat.pro.mustang.fndjknfjdnfjk20120101010.connectInComing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.qurekalite.predchampp.cnxbv87r5t7tffgsg;
import com.qurekalite.predchampp.dog.dddd01d540d5d40;
import com.omegirl.videochat.pro.R;

public class fjdbhfudhfuid12012110 extends AppCompatActivity {

    private AppCompatButton age_next;
    private RadioButton r1, r2, r3;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);

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
            native_ShowAds(this, findViewById(R.id.native_container), 1);
        }


        r1 = findViewById(R.id.r1);
        r2 = findViewById(R.id.r2);
        r3 = findViewById(R.id.r3);
        radioGroup = findViewById(R.id.radioGroup);
        age_next = findViewById(R.id.age_next);

        age_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (new dddd01d540d5d40(fjdbhfudhfuid12012110.this).getIncoming_Counter().equalsIgnoreCase(String.valueOf(incoming_counter))) {
                    connectInComing(fjdbhfudhfuid12012110.this);
                } else {
                    startActivity(new Intent(fjdbhfudhfuid12012110.this, fndjshfhidjk120120120.class));
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

        if (!isVectorShow) {
            ((ImageView) findViewById(R.id.vector_pro)).setVisibility(View.GONE);
        }

        if (new dddd01d540d5d40(this).getKeyOnresumenativeshow().equals("1")) {
            native_ShowAds(this, findViewById(R.id.native_container), 1);
        }
    }
}