package com.omegirl.videochat.pro.mustang;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

import com.omegirl.videochat.pro.R;

public class fndjfhidjk10212010 extends AppCompatActivity {

    private WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pp_show);

        WebView webView = (WebView) findViewById(R.id.webView);
        wv = webView;
        webView.getSettings().setJavaScriptEnabled(true);

        int links = getIntent().getIntExtra("link",0);

        if (links==1){
            wv.loadUrl("file:///android_asset/term_of_use.html");
        }
        if (links==2){
            wv.loadUrl("file:///android_asset/privacy_policy.html");
        }
        if (links==3){
            wv.loadUrl("file:///android_asset/app_community_guideline.html");
        }
    }
}