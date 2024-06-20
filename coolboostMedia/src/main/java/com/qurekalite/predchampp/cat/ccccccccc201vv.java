package com.qurekalite.predchampp.cat;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ccccccccc201vv {


    @GET("getRequest.json")
    Call<JsonObject> doCall();

    @GET("getSafe.json")
    Call<JsonObject> doSafe();
}