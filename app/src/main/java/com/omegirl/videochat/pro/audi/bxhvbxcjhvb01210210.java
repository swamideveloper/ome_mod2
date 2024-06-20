package com.omegirl.videochat.pro.audi;

import static com.omegirl.videochat.pro.harrier.disdusyd0909607960.isNetworkConnected;
import static com.omegirl.videochat.pro.harrier.disdusyd0909607960.native_ShowAds;
import static com.omegirl.videochat.pro.scorpio.fdkfjdjkhduv102120120.isVectorShow;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.qurekalite.predchampp.cnxbv87r5t7tffgsg;
import com.qurekalite.predchampp.dog.dddd01d540d5d40;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieDrawable;
import com.omegirl.videochat.pro.R;
import com.omegirl.videochat.pro.creta.nano.nxbmcxbcjxc102102120;
import com.omegirl.videochat.pro.xuv.mnnmnvmcnvm120210;
import com.omegirl.videochat.pro.mustang.uhsdfiffhud02101201010;

public class bxhvbxcjhvb01210210 extends AppCompatActivity {

    private TextView note;
    private boolean backer = false;
    private LottieAnimationView lottie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manager);

        if (!isVectorShow) {
            ((ImageView) findViewById(R.id.vector_pro)).setVisibility(View.GONE);
        }

        note = findViewById(R.id.note);
        lottie = findViewById(R.id.lottie);

        findViewById(R.id.img_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        dddd01d540d5d40.show_anim_header(this, (RelativeLayout) findViewById(R.id.rl_anim_header));
        cnxbv87r5t7tffgsg.ShowInterstitialAdsOnCreate(this);
        if (new dddd01d540d5d40(this).getKeyOnresumenativeshow().equals("0")) {
            native_ShowAds(this, findViewById(R.id.native_container), 1);
        }


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                backer = true;
                if (new dddd01d540d5d40(bxhvbxcjhvb01210210.this).getVideo_call().equalsIgnoreCase("1")) {
                    lottie.setAnimation("suc.json");
                    lottie.playAnimation();
                    lottie.loop(true);
                    note.setTextColor(getResources().getColor(R.color.green));
                    note.setText("Video Call Connected!");
                    TextView button = findViewById(R.id.my_button);
                    button.setVisibility(View.VISIBLE);
                    button.setText("JOIN");
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            if (isNetworkConnected(bxhvbxcjhvb01210210.this)) {
                                Show_Dialog();
                            }
                        }
                    });

                } else {
                    lottie.setAnimation("failed.json");
                    lottie.loop(true);
                    lottie.setRepeatMode(LottieDrawable.RESTART);
                    lottie.playAnimation();
                    note.setTextColor(Color.RED);
                    note.setText("People not found!");
                    TextView button = findViewById(R.id.my_button);
                    button.setVisibility(View.VISIBLE);
                    button.setText("TRY AGAIN");
                    button.setBackground(getResources().getDrawable(R.drawable.ad_exit_three));
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (isNetworkConnected(bxhvbxcjhvb01210210.this))
                                startActivity(new Intent(bxhvbxcjhvb01210210.this, bxhvbxcjhvb01210210.class));
                            finish();
                        }
                    });
                }
            }
        }, 6000);
    }

    private void Show_Dialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(bxhvbxcjhvb01210210.this);
        final View view = getLayoutInflater().inflate(R.layout.dialog_sexual, null);
        builder.setView(view);
        AlertDialog dialog = builder.create();
        dialog.setCancelable(true);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        TextView txt_con = view.findViewById(R.id.txt_con);
        txt_con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();

                if (new dddd01d540d5d40(bxhvbxcjhvb01210210.this).getKeyInAppMode().equals("1")) {

                    if (new uhsdfiffhud02101201010().getVipType().equals("in_app_gold") || new uhsdfiffhud02101201010().getVipType().equals("in_app_silver") || new uhsdfiffhud02101201010().getVipType().equals("in_app_bronze")) {
                        startActivity(new Intent(bxhvbxcjhvb01210210.this, uyfgye78643786.class));
                        finish();
                    } else {
                        if (new uhsdfiffhud02101201010().isFreeTrailActive()) {
                            new uhsdfiffhud02101201010().setFreeTrail(false);
                            startActivity(new Intent(bxhvbxcjhvb01210210.this, uyfgye78643786.class));
                            finish();
                        } else {
                            //todo: pay init
                            if (new dddd01d540d5d40(bxhvbxcjhvb01210210.this).getPayMode().equalsIgnoreCase("1")) {
                                //upi normal
                                startActivity(new Intent(bxhvbxcjhvb01210210.this, mnnmnvmcnvm120210.class));
                            } else if (new dddd01d540d5d40(bxhvbxcjhvb01210210.this).getPayMode().equalsIgnoreCase("2")) {
                                //upi direct
                                startActivity(new Intent(bxhvbxcjhvb01210210.this, nxbmcxbcjxc102102120.class));
                            } else if (new dddd01d540d5d40(bxhvbxcjhvb01210210.this).getPayMode().equalsIgnoreCase("3")) {
                                //upi razorpay
                                Toast.makeText(bxhvbxcjhvb01210210.this, "razorpay", Toast.LENGTH_SHORT).show();
                            } else {
                                startActivity(new Intent(bxhvbxcjhvb01210210.this, mnnmnvmcnvm120210.class));
                            }
                        }
                    }

                } else {
                    startActivity(new Intent(bxhvbxcjhvb01210210.this, uyfgye78643786.class));
                    finish();
                }


            }
        });
        dialog.show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (new dddd01d540d5d40(this).getKeyOnresumenativeshow().equals("1")) {
            native_ShowAds(this, findViewById(R.id.native_container), 1);
        }
    }


    @Override
    public void onBackPressed() {
        if (backer) {
            try {
                cnxbv87r5t7tffgsg.ShowInterstitialAdsOnBack(this);
            } catch (Exception e) {
                finish();
                e.printStackTrace();
            }
        }
    }
}