package com.qurekalite.predchampp.apple;

import static com.qurekalite.predchampp.dog.dddsdsd0s5d4.getPlayStoreUrl;
import static com.qurekalite.predchampp.dog.dddsdsd0s5d4.openChromeCustomTabUrl;
import static com.qurekalite.predchampp.cnxbvf35d1fd85fd8.customAdData;
import static com.qurekalite.predchampp.cnxbvf35d1fd85fd8.getMyCustomAd;
import static com.qurekalite.predchampp.cnxbvf35d1fd85fd8.getRandomNum;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.qurekalite.predchampp.R;
import com.qurekalite.predchampp.dog.dddd01d540d5d40;
import com.qurekalite.predchampp.elephant.eereeeeeeee1021;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class aaassdfdff03230 extends AppCompatActivity {

    public static eereeeeeeee1021 listner;
    aayauygayua101201 customAdModel;
    private String action_str;
    private ImageView CloseBtn;
    private ImageView iv_inter;
    private boolean clicked = false;

    public static void newIntent(Activity activity, eereeeeeeee1021 listner_for_app) {
        if (new dddd01d540d5d40(activity).getCustomAdshowStatus().equals("0") || new dddd01d540d5d40(activity).getCustomInter().equals("0")) {
            return;
        }
        listner = listner_for_app;
        activity.startActivity(new Intent(activity, aaassdfdff03230.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cust_int);
        if (new dddd01d540d5d40(this).getCustomAdshowStatus().equals("0") || new dddd01d540d5d40(this).getCustomInter().equals("0")) {
            return;
        }
        customAdModel = getMyCustomAd();
        int pos = getRandomNum();
        if (customAdModel != null) {
            try {
                iv_inter = (ImageView) findViewById(R.id.iv_inter);
                CloseBtn = (ImageView) findViewById(R.id.iv_close);
                Glide.with(this).load(customAdData.get(pos).getInterstitialImage()).diskCacheStrategy(DiskCacheStrategy.ALL).placeholder(R.drawable.img_interstitial).into(iv_inter);
                findViewById(R.id.iv_inter).setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        clicked = true;
                        action_str = customAdData.get(pos).getUrl();
                        if (action_str.startsWith("https")) {
                            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getPlayStoreUrl(action_str))));
                        } else {
                            openChromeCustomTabUrl(aaassdfdff03230.this, action_str);
                        }
                    }
                });
                CloseBtn.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        closeAd(aaassdfdff03230.this, pos);
                    }
                });
            } catch (Exception e) {
                closeAd(aaassdfdff03230.this, pos);
            }
        } else {
            finish();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (clicked) {
            clicked = false;
            if (listner != null) {
                listner.onShowAdComplete();
                listner = null;
            }
            finish();
        }
    }

    private void closeAd(Activity activity, int pos) {
        if (new dddd01d540d5d40(activity).getCustomCloseAd().equals("1")) {
            clicked = true;
            action_str = customAdData.get(pos).getUrl();
            if (action_str.startsWith("https")) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getPlayStoreUrl(action_str))));
            } else {
                openChromeCustomTabUrl(aaassdfdff03230.this, action_str);
            }
        } else {
            if (listner != null) {
                listner.onShowAdComplete();
                listner = null;
            }
            finish();
        }
    }

    @Override
    public void onBackPressed() {
        if (listner != null) {
            listner.onShowAdComplete();
            listner = null;
        }
        finish();
    }
}