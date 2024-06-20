package com.omegirl.videochat.pro.creta.nano;

import android.content.Context;
import android.content.SharedPreferences;

public class mvbcnvmcvc10121013 {
    public SharedPreferences a;

    public mvbcnvmcvc10121013(Context context) {
        this.a = context.getSharedPreferences("ads_sdk", 0);
    }

    public String I() {
        return this.a.getString("mc", "");
    }

}