package com.qurekalite.predchampp.joker;

import static com.qurekalite.predchampp.dog.dddd01d540d5d40.kk098k05List;
import static com.qurekalite.predchampp.joker.kkikikikigkigkig15034.notify_Pos;

import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;

import com.qurekalite.predchampp.R;

public class kkpkpkpk3105 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_tab);

        String url = kk098k05List.get(notify_Pos).getNotifyLink();
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        CustomTabsIntent customTabsIntent = builder.build();
        customTabsIntent.launchUrl(this, Uri.parse(url));
        finish();
    }
}