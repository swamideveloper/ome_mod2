package com.qurekalite.predchampp.joker;

import android.content.Context;

import com.qurekalite.predchampp.dog.dddd01d540d5d40;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class kkkkkkkkkkkkfdfd650 {
    private static Retrofit retrofit;

    public static Retrofit getRetrofitInstance(Context context) {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(new dddd01d540d5d40(context).getKeyNotification_Link())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}