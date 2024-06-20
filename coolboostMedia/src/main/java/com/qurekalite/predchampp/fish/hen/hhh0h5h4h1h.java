package com.qurekalite.predchampp.fish.hen;

import android.content.Context;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class hhh0h5h4h1h {

//    public static final String BASE_URL = "http://ip-api.com/";

    public static hh14hh540hhh getGeoApiService(Context context, String pk) {
        return new Retrofit.Builder()
                .baseUrl(hhh25h1265h1h.baseURL(context, pk))
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(hh14hh540hhh.class);
    }

}
