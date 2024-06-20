package com.omegirl.videochat.pro.scorpio;

import static com.qurekalite.predchampp.dog.dddd01d540d5d40.app_count_click;
import static com.omegirl.videochat.pro.scorpio.fdkfjdjkhduv102120120.incoming_counter;
import static com.omegirl.videochat.pro.harrier.disdusyd0909607960.native_ShowAds;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.qurekalite.predchampp.cnxbv87r5t7tffgsg;
import com.qurekalite.predchampp.bat.bhbhbhbhbbhbhdb1354;
import com.qurekalite.predchampp.dog.dddd01d540d5d40;
import com.qurekalite.predchampp.elephant.eereeeeeeee1021;
import com.omegirl.videochat.pro.R;

public class fndjkfduifhduinf12012010 extends AppCompatActivity {

    TextView tv_description, tv_title;
    int counter;
    RelativeLayout rl_7, rl_8, rl_9, rl_10, rl_11, rl_12, rl_13, rl_14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advice);

        findViewById(R.id.img_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        dddd01d540d5d40.show_anim_header(this, (RelativeLayout) findViewById(R.id.rl_anim_header));
        cnxbv87r5t7tffgsg.ShowInterstitialAdsOnCreate(this);
        if (new dddd01d540d5d40(this).getKeyOnresumenativeshow().equals("0")) {
            native_ShowAds(this, findViewById(R.id.native_container), 2);
        }


        init();

    }

    public void init() {

        counter = getIntent().getIntExtra("counter", 0);

        tv_description = findViewById(R.id.tv_description);
        tv_title = findViewById(R.id.tv_title);
        rl_7 = findViewById(R.id.rl_7);
        rl_8 = findViewById(R.id.rl_8);
        rl_9 = findViewById(R.id.rl_9);
        rl_10 = findViewById(R.id.rl_10);
        rl_11 = findViewById(R.id.rl_11);
        rl_12 = findViewById(R.id.rl_12);
        rl_13 = findViewById(R.id.rl_13);
        rl_14 = findViewById(R.id.rl_14);

        if (counter == 0) {
            rl_7.setVisibility(View.GONE);
            tv_description.setText(R.string.advice_1);
            tv_title.setText(R.string.title_1);
        } else if (counter == 1) {
            rl_7.setVisibility(View.GONE);
            tv_description.setText(R.string.advice_1);
            tv_title.setText(R.string.title_1);
        } else if (counter == 2) {
            rl_8.setVisibility(View.GONE);
            tv_description.setText(R.string.advice_2);
            tv_title.setText(R.string.title_2);
        } else if (counter == 3) {
            rl_9.setVisibility(View.GONE);
            tv_description.setText(R.string.advice_3);
            tv_title.setText(R.string.title_3);
        } else if (counter == 4) {
            rl_10.setVisibility(View.GONE);
            tv_description.setText(R.string.advice_4);
            tv_title.setText(R.string.title_4);
        } else if (counter == 5) {
            rl_11.setVisibility(View.GONE);
            tv_description.setText(R.string.advice_5);
            tv_title.setText(R.string.title_5);
        } else if (counter == 6) {
            rl_12.setVisibility(View.GONE);
            tv_description.setText(R.string.advice_6);
            tv_title.setText(R.string.title_6);
        } else if (counter == 7) {
            rl_13.setVisibility(View.GONE);
            tv_description.setText(R.string.advice_7);
            tv_title.setText(R.string.title_7);
        } else if (counter == 8) {
            rl_14.setVisibility(View.GONE);
            tv_description.setText(R.string.advice_8);
            tv_title.setText(R.string.title_8);
        }


        rl_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bhbhbhbhbbhbhdb1354.getManager(fndjkfduifhduinf12012010.this).showInterAd(fndjkfduifhduinf12012010.this, new eereeeeeeee1021() {
                    @Override
                    public void onShowAdComplete() {
                        bhbhbhbhbbhbhdb1354.getManager(fndjkfduifhduinf12012010.this).showFacebookAds(fndjkfduifhduinf12012010.this);

                        incoming_counter++;
                        rl_7.setVisibility(View.GONE);
                        rl_8.setVisibility(View.VISIBLE);
                        rl_9.setVisibility(View.VISIBLE);
                        rl_10.setVisibility(View.VISIBLE);
                        rl_11.setVisibility(View.VISIBLE);
                        rl_12.setVisibility(View.VISIBLE);
                        rl_13.setVisibility(View.VISIBLE);
                        rl_14.setVisibility(View.VISIBLE);
                        tv_description.setText(R.string.advice_1);
                        tv_title.setText(R.string.title_1);
                    }
                }, app_count_click);


            }
        });
        rl_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bhbhbhbhbbhbhdb1354.getManager(fndjkfduifhduinf12012010.this).showInterAd(fndjkfduifhduinf12012010.this, new eereeeeeeee1021() {
                    @Override
                    public void onShowAdComplete() {
                        bhbhbhbhbbhbhdb1354.getManager(fndjkfduifhduinf12012010.this).showFacebookAds(fndjkfduifhduinf12012010.this);

                        rl_8.setVisibility(View.GONE);
                        rl_7.setVisibility(View.VISIBLE);
                        rl_9.setVisibility(View.VISIBLE);
                        rl_10.setVisibility(View.VISIBLE);
                        rl_11.setVisibility(View.VISIBLE);
                        rl_12.setVisibility(View.VISIBLE);
                        rl_13.setVisibility(View.VISIBLE);
                        rl_14.setVisibility(View.VISIBLE);
                        tv_description.setText(R.string.advice_2);
                        tv_title.setText(R.string.title_2);
                    }
                }, app_count_click);

            }
        });
        rl_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bhbhbhbhbbhbhdb1354.getManager(fndjkfduifhduinf12012010.this).showInterAd(fndjkfduifhduinf12012010.this, new eereeeeeeee1021() {
                    @Override
                    public void onShowAdComplete() {
                        bhbhbhbhbbhbhdb1354.getManager(fndjkfduifhduinf12012010.this).showFacebookAds(fndjkfduifhduinf12012010.this);

                        rl_9.setVisibility(View.GONE);
                        rl_7.setVisibility(View.VISIBLE);
                        rl_8.setVisibility(View.VISIBLE);
                        rl_10.setVisibility(View.VISIBLE);
                        rl_11.setVisibility(View.VISIBLE);
                        rl_12.setVisibility(View.VISIBLE);
                        rl_13.setVisibility(View.VISIBLE);
                        rl_14.setVisibility(View.VISIBLE);
                        tv_description.setText(R.string.advice_3);
                        tv_title.setText(R.string.title_3);
                    }
                }, app_count_click);


            }
        });
        rl_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bhbhbhbhbbhbhdb1354.getManager(fndjkfduifhduinf12012010.this).showInterAd(fndjkfduifhduinf12012010.this, new eereeeeeeee1021() {
                    @Override
                    public void onShowAdComplete() {
                        bhbhbhbhbbhbhdb1354.getManager(fndjkfduifhduinf12012010.this).showFacebookAds(fndjkfduifhduinf12012010.this);

                        rl_10.setVisibility(View.GONE);
                        rl_7.setVisibility(View.VISIBLE);
                        rl_8.setVisibility(View.VISIBLE);
                        rl_9.setVisibility(View.VISIBLE);
                        rl_11.setVisibility(View.VISIBLE);
                        rl_12.setVisibility(View.VISIBLE);
                        rl_13.setVisibility(View.VISIBLE);
                        rl_14.setVisibility(View.VISIBLE);
                        tv_description.setText(R.string.advice_4);
                        tv_title.setText(R.string.title_4);
                    }
                }, app_count_click);


            }
        });
        rl_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bhbhbhbhbbhbhdb1354.getManager(fndjkfduifhduinf12012010.this).showInterAd(fndjkfduifhduinf12012010.this, new eereeeeeeee1021() {
                    @Override
                    public void onShowAdComplete() {
                        bhbhbhbhbbhbhdb1354.getManager(fndjkfduifhduinf12012010.this).showFacebookAds(fndjkfduifhduinf12012010.this);

                        rl_11.setVisibility(View.GONE);
                        rl_7.setVisibility(View.VISIBLE);
                        rl_8.setVisibility(View.VISIBLE);
                        rl_9.setVisibility(View.VISIBLE);
                        rl_10.setVisibility(View.VISIBLE);
                        rl_12.setVisibility(View.VISIBLE);
                        rl_13.setVisibility(View.VISIBLE);
                        rl_14.setVisibility(View.VISIBLE);
                        tv_description.setText(R.string.advice_5);
                        tv_title.setText(R.string.title_5);
                    }
                }, app_count_click);


            }
        });
        rl_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bhbhbhbhbbhbhdb1354.getManager(fndjkfduifhduinf12012010.this).showInterAd(fndjkfduifhduinf12012010.this, new eereeeeeeee1021() {
                    @Override
                    public void onShowAdComplete() {
                        bhbhbhbhbbhbhdb1354.getManager(fndjkfduifhduinf12012010.this).showFacebookAds(fndjkfduifhduinf12012010.this);

                        rl_12.setVisibility(View.GONE);
                        rl_7.setVisibility(View.VISIBLE);
                        rl_8.setVisibility(View.VISIBLE);
                        rl_9.setVisibility(View.VISIBLE);
                        rl_10.setVisibility(View.VISIBLE);
                        rl_11.setVisibility(View.VISIBLE);
                        rl_13.setVisibility(View.VISIBLE);
                        rl_14.setVisibility(View.VISIBLE);
                        tv_description.setText(R.string.advice_6);
                        tv_title.setText(R.string.title_6);
                    }
                }, app_count_click);


            }
        });
        rl_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bhbhbhbhbbhbhdb1354.getManager(fndjkfduifhduinf12012010.this).showInterAd(fndjkfduifhduinf12012010.this, new eereeeeeeee1021() {
                    @Override
                    public void onShowAdComplete() {
                        bhbhbhbhbbhbhdb1354.getManager(fndjkfduifhduinf12012010.this).showFacebookAds(fndjkfduifhduinf12012010.this);

                        rl_13.setVisibility(View.GONE);
                        rl_7.setVisibility(View.VISIBLE);
                        rl_8.setVisibility(View.VISIBLE);
                        rl_9.setVisibility(View.VISIBLE);
                        rl_10.setVisibility(View.VISIBLE);
                        rl_11.setVisibility(View.VISIBLE);
                        rl_12.setVisibility(View.VISIBLE);
                        rl_14.setVisibility(View.VISIBLE);
                        tv_description.setText(R.string.advice_7);
                        tv_title.setText(R.string.title_7);
                    }
                }, app_count_click);


            }
        });
        rl_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bhbhbhbhbbhbhdb1354.getManager(fndjkfduifhduinf12012010.this).showInterAd(fndjkfduifhduinf12012010.this, new eereeeeeeee1021() {
                    @Override
                    public void onShowAdComplete() {
                        bhbhbhbhbbhbhdb1354.getManager(fndjkfduifhduinf12012010.this).showFacebookAds(fndjkfduifhduinf12012010.this);

                        rl_14.setVisibility(View.GONE);
                        rl_7.setVisibility(View.VISIBLE);
                        rl_8.setVisibility(View.VISIBLE);
                        rl_9.setVisibility(View.VISIBLE);
                        rl_10.setVisibility(View.VISIBLE);
                        rl_11.setVisibility(View.VISIBLE);
                        rl_12.setVisibility(View.VISIBLE);
                        rl_13.setVisibility(View.VISIBLE);
                        tv_description.setText(R.string.advice_8);
                        tv_title.setText(R.string.title_8);
                    }
                }, app_count_click);


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