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

public class fbdbhfudybfk12012010 extends AppCompatActivity {

    private LinearLayout room1, room2, room3, room4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rooms);

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


        room1 = findViewById(R.id.room1);
        room2 = findViewById(R.id.room2);
        room3 = findViewById(R.id.room3);
        room4 = findViewById(R.id.room4);

        room1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next();
            }
        });
        room2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next();
            }
        });
        room3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next();
            }
        });
        room4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next();
            }
        });
    }

    private void next() {
        if (new dddd01d540d5d40(fbdbhfudybfk12012010.this).getIncoming_Counter().equalsIgnoreCase(String.valueOf(incoming_counter))) {
            connectInComing(fbdbhfudybfk12012010.this);
        } else {
            startActivity(new Intent(fbdbhfudybfk12012010.this, bxhvbxcjhvb01210210.class));
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
            native_ShowAds(this, findViewById(R.id.native_container), 1);
        }
    }
}