package com.qurekalite.predchampp;

import static com.qurekalite.predchampp.fish.hen.hhh0h5h4h1h.getGeoApiService;
import static com.qurekalite.predchampp.dog.dddd01d540d5d40.Glob_Notification_Minutes;
import static com.qurekalite.predchampp.dog.dddd01d540d5d40.app_back_count_click;
import static com.qurekalite.predchampp.dog.dddd01d540d5d40.app_count_click;
import static com.qurekalite.predchampp.dog.dddd01d540d5d40.kk098k05List;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.qurekalite.predchampp.apple.aayauygayua101201;
import com.qurekalite.predchampp.dog.dddd01d540d5d40;
import com.qurekalite.predchampp.fish.gun.guguggg04;
import com.qurekalite.predchampp.fish.gun.gt1g641g65;
import com.qurekalite.predchampp.fish.hen.hhghgh05h4h40h5;
import com.qurekalite.predchampp.fish.hen.hh14hh540hhh;
import com.qurekalite.predchampp.fish.icecream.iioiiii0235;
import com.qurekalite.predchampp.fish.icecream.iioioioioio10543;
import com.qurekalite.predchampp.fish.icecream.ioiiiii206;
import com.qurekalite.predchampp.bat.bdhubfd67fdft;
import com.qurekalite.predchampp.cat.cxcdccccc5c05;
import com.qurekalite.predchampp.cat.ccccccccc201vv;
import com.qurekalite.predchampp.dog.dddsdsd0s5d4;
import com.qurekalite.predchampp.elephant.eereeeeeeee1021;
import com.qurekalite.predchampp.joker.kk0486k40k654k;
import com.qurekalite.predchampp.joker.kkikikikigkigkig15034;
import com.qurekalite.predchampp.joker.kkkkkkkkkkkkfdfd650;
import com.qurekalite.predchampp.joker.kite.kk560kk4;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public abstract class cnxbvf35d1fd85fd8 extends AppCompatActivity {
    private static final String TAG = cnxbvf35d1fd85fd8.class.getSimpleName();

    private static final int REQUEST_CODE_POST_NOTIFICATION = 30;
    private static int totalAdInc;
    private static Random r;
    private JsonArray jsonArray;


    //verify
    String iType = "";
    public boolean excludeChecker = false;
    public boolean includeChecker = false;
    private int globalVerionCode = 1;


    public abstract void onComplete();

    public void loadSplash(Boolean debug, int versionCode) {
        dddsdsd0s5d4.DEBUG = debug;
        globalVerionCode = versionCode;
        if (!dddsdsd0s5d4.isNetworkAvailable(cnxbvf35d1fd85fd8.this)) {

            new AlertDialog.Builder(cnxbvf35d1fd85fd8.this)
                    .setTitle("No Internet")
                    .setCancelable(false)
                    .setMessage("Please check your internet connection and try again.")
                    .setPositiveButton("Try Again", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            loadSplash(debug, versionCode);
                        }
                    }).setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int i) {
                            dialog.dismiss();
                            finishAffinity();
                        }
                    }).setIcon(android.R.drawable.ic_dialog_alert).show();
        } else {

            //check Safety..
            gt1g641g65 sInterface = guguggg04.getClient(getApplicationContext(), getApplicationContext().getPackageName()).create(gt1g641g65.class);
            Call<iioiiii0235> callSetting = sInterface.doCall();
            callSetting.enqueue(new Callback<iioiiii0235>() {
                @Override
                public void onResponse(Call<iioiiii0235> call, Response<iioiiii0235> response) {
                    iioioioioio10543 app_settings = response.body().getSettings();

                    iType = app_settings.getLocType();
                    verifyUser(app_settings.getLocArray());
                }

                @Override
                public void onFailure(Call<iioiiii0235> call, Throwable t) {
                    safeCalling();
                }
            });


        }
    }

    private void verifyUser(List<ioiiiii206> iArray) {
        hh14hh540hhh apiService = getGeoApiService(getApplicationContext(), getApplicationContext().getPackageName());
        apiService.getLocation().enqueue(new retrofit2.Callback<hhghgh05h4h40h5>() {
            @Override
            public void onResponse(Call<hhghgh05h4h40h5> call, Response<hhghgh05h4h40h5> response) {
                String uCountryCode = response.body().getCountryCode();
                String uStateCode = response.body().getRegion();
                String uCityName = response.body().getCity();


                switch (iType) {
                    case "include":
                        for (int k = 0; k < iArray.size(); k++) {
                            if (uCountryCode.equalsIgnoreCase(iArray.get(k).getCountryCode()) ||
                                    uStateCode.equalsIgnoreCase(iArray.get(k).getStateCode()) ||
                                    uCityName.equalsIgnoreCase(iArray.get(k).getCityName())) {
                                k = 999;
                                includeChecker = true;
                            }
                        }

                        if (includeChecker) {
                            safeCalling();
                        } else {
                            calling();
                        }
                        break;

                    case "exclude":
                        for (int j = 0; j < iArray.size(); j++) {
                            if (uCountryCode.equalsIgnoreCase(iArray.get(j).getCountryCode()) ||
                                    uStateCode.equalsIgnoreCase(iArray.get(j).getStateCode()) ||
                                    uCityName.equalsIgnoreCase(iArray.get(j).getCityName())) {
                                j = 999;
                                excludeChecker = true;
                            }
                        }

                        if (excludeChecker) {
                            safeCalling();
                        } else {
                            calling();
                        }
                        break;

                    default:
                        safeCalling();
                        break;
                }
            }

            @Override
            public void onFailure(Call<hhghgh05h4h40h5> call, Throwable t) {
                safeCalling();
            }
        });
    }

    private void calling() {
        //call Normal..
        ccccccccc201vv ccccccccc201vv = cxcdccccc5c05.getClient(getApplicationContext(), getApplicationContext().getPackageName()).create(ccccccccc201vv.class);
        Call<JsonObject> call = ccccccccc201vv.doCall();
        call.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                new dddd01d540d5d40(cnxbvf35d1fd85fd8.this).setInstallType();
                if (response.body() != null && response.body().get("status").getAsBoolean()) {
                    JsonObject app_seeting = response.body().get("data").getAsJsonObject();
                    new dddd01d540d5d40(cnxbvf35d1fd85fd8.this).setAdsResponse(app_seeting);
                    jsonArray = app_seeting.getAsJsonArray("OmeGirl_VideoChat_with_CoolbootsMedia__Mod2__customAdData");
                    getSplashMoreAppData(jsonArray, cnxbvf35d1fd85fd8.this);
                }

                if (new dddd01d540d5d40(cnxbvf35d1fd85fd8.this).getAppUpdateFlag() && new dddd01d540d5d40(cnxbvf35d1fd85fd8.this).getUpdateVersionCode() > globalVerionCode) {
                    new AlertDialog.Builder(cnxbvf35d1fd85fd8.this)
                            .setTitle("New Version Available")
                            .setCancelable(false)
                            .setMessage("It looks like you have an old version of the app, Please update the app and enjoy our latest features.")
                            .setPositiveButton("Update now", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                    dddsdsd0s5d4.rateUs(cnxbvf35d1fd85fd8.this);
                                    finishAffinity();
                                }
                            }).setNegativeButton("Later", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                    checkVpnEnable();
                                }
                            }).show();
                } else {
                    checkVpnEnable();
                }
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
//                    Log.e("@@TAG", "onFailure: " + t.getMessage());
                new dddd01d540d5d40(cnxbvf35d1fd85fd8.this).setInstallType();
                checkVpnEnable();
            }
        });
    }

    private void safeCalling() {
        //call Normal..
        ccccccccc201vv ccccccccc201vv = cxcdccccc5c05.getClient(getApplicationContext(), getApplicationContext().getPackageName()).create(ccccccccc201vv.class);
        Call<JsonObject> call = ccccccccc201vv.doSafe();
        call.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                new dddd01d540d5d40(cnxbvf35d1fd85fd8.this).setInstallType();
                if (response.body() != null && response.body().get("status").getAsBoolean()) {
                    JsonObject app_seeting = response.body().get("data").getAsJsonObject();
                    new dddd01d540d5d40(cnxbvf35d1fd85fd8.this).setAdsResponse(app_seeting);
                    jsonArray = app_seeting.getAsJsonArray("OmeGirl_VideoChat_with_CoolbootsMedia__Mod2__customAdData");
                    getSplashMoreAppData(jsonArray, cnxbvf35d1fd85fd8.this);
                }

                if (new dddd01d540d5d40(cnxbvf35d1fd85fd8.this).getAppUpdateFlag() && new dddd01d540d5d40(cnxbvf35d1fd85fd8.this).getUpdateVersionCode() > globalVerionCode) {
                    new AlertDialog.Builder(cnxbvf35d1fd85fd8.this)
                            .setTitle("New Version Available")
                            .setCancelable(false)
                            .setMessage("It looks like you have an old version of the app, Please update the app and enjoy our latest features.")
                            .setPositiveButton("Update now", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                    dddsdsd0s5d4.rateUs(cnxbvf35d1fd85fd8.this);
                                    finishAffinity();
                                }
                            }).setNegativeButton("Later", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                    checkVpnEnable();
                                }
                            }).show();
                } else {
                    checkVpnEnable();
                }
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
//                    Log.e("@@TAG", "onFailure: " + t.getMessage());
                new dddd01d540d5d40(cnxbvf35d1fd85fd8.this).setInstallType();
                checkVpnEnable();
            }
        });
    }

    public static ArrayList<aayauygayua101201> customAdData = new ArrayList<>();

    public void getSplashMoreAppData(JsonArray response, Activity activity) {
        if (customAdData != null) {
            customAdData.clear();
        }
        if (response != null) {
            for (int i = 0; i < response.size(); i++) {
                JsonObject object = (JsonObject) response.get(i);
                customAdData.add(new aayauygayua101201(object.get("OmeGirl_VideoChat_with_CoolbootsMedia__Mod2__cust_id").getAsString(), object.get("OmeGirl_VideoChat_with_CoolbootsMedia__Mod2__cust_name").getAsString(), object.get("OmeGirl_VideoChat_with_CoolbootsMedia__Mod2__cust_url").getAsString(), object.get("OmeGirl_VideoChat_with_CoolbootsMedia__Mod2__cust_appopen_image").getAsString(), object.get("OmeGirl_VideoChat_with_CoolbootsMedia__Mod2__cust_interstitial_image").getAsString(), object.get("OmeGirl_VideoChat_with_CoolbootsMedia__Mod2__cust_small_native_image").getAsString(), object.get("OmeGirl_VideoChat_with_CoolbootsMedia__Mod2__cust_native_image").getAsString()));
            }
            //notification
            if (new dddd01d540d5d40(cnxbvf35d1fd85fd8.this).getKeyNotification_Status().equals("1")) {
//                Log.e("@@notify", "notification mode >>> ACTIVE");

                //get notification data
                kk0486k40k654k kk0486k40k654k = kkkkkkkkkkkkfdfd650.getRetrofitInstance(getApplicationContext()).create(kk0486k40k654k.class);
                Call<kk560kk4> call = kk0486k40k654k.getNotifyData();
                call.enqueue(new Callback<kk560kk4>() {
                    @Override
                    public void onResponse(Call<kk560kk4> call, Response<kk560kk4> response) {
                        if (response.isSuccessful()) {
                            kk560kk4 notification = response.body();
//                            Log.e("@@notify", "time: " + notification.getNotificationTime());
                            Glob_Notification_Minutes = notification.getNotificationTime();
                            if (notification.getNotificationData().size() > 0) {
                                kk098k05List = notification.getNotificationData();
//                                Log.e("@@notify", "data added successful!");


                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        if (!kkikikikigkigkig15034.IS_ACTIVITY_RUNNING) {
                                            try {
                                                startService();
                                            } catch (Exception e) {
//                                                Log.e("@@notify", "error1: " + e.getMessage());
                                            }
                                        }


                                    }
                                }, 1000);

                            } else {
//                                Log.e("@@notify", "error: data 0");
                            }
                        } else {
//                            Log.e("@@notify", "onFailure: " + "response failed!");
                        }
                    }

                    @Override
                    public void onFailure(Call<kk560kk4> call, Throwable t) {
//                        Log.e("@@notify", "onFailure: " + t.getMessage());
                    }
                });

            } else {
//                Log.e("@@notify", "notification mode >>> DISABLE");
            }
        }
    }

    public void startService() {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            Intent pushIntent = new Intent(this, kkikikikigkigkig15034.class);
            startForegroundService(pushIntent);
        } else {
            Intent pushIntent = new Intent(this, kkikikikigkigkig15034.class);
            startService(pushIntent);
        }

    }

    public static aayauygayua101201 getMyCustomAd() {
        aayauygayua101201 customAdModel = null;
        if (totalAdInc == customAdData.size()) {
            totalAdInc = 0;
        }
        customAdModel = customAdData.get(totalAdInc);
        totalAdInc++;
        return customAdModel;
    }

    public static int getRandomNum() {
        int size = customAdData.size();
        int min = 0;
        int max = size - 1;
        r = new Random();
        int output = r.nextInt((max - min) + 1) + min;
        return output;
    }

    private void checkVpnEnable() {
        loadAd();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == REQUEST_CODE_POST_NOTIFICATION) {
            loadAd();
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_CODE_POST_NOTIFICATION) {
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS) == PackageManager.PERMISSION_GRANTED) {
                loadAd();
            } else {
                new AlertDialog.Builder(cnxbvf35d1fd85fd8.this)
                        .setTitle("Permission settings")
                        .setCancelable(false)
                        .setMessage("Notification permission is not enabled. Do you want to go to settings menu?")
                        .setPositiveButton("iioiiii0235", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                                Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS, Uri.parse("package:" + getPackageName()));
                                try {
                                    startActivityForResult(intent, REQUEST_CODE_POST_NOTIFICATION);
                                } catch (ActivityNotFoundException e) {
                                    e.printStackTrace();
                                    loadAd();
                                }
                            }
                        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                                loadAd();
                            }
                        }).show();
            }
        }
    }

    private void loadAd() {
        if (dddsdsd0s5d4.isNetworkAvailable(cnxbvf35d1fd85fd8.this) && new dddd01d540d5d40(cnxbvf35d1fd85fd8.this).getAdsFlag()) {
            if (new dddd01d540d5d40(cnxbvf35d1fd85fd8.this).getAdmobInterStatus().equals("1")) {
                if (new dddd01d540d5d40(cnxbvf35d1fd85fd8.this).getCountClick() != 0) {
                    app_count_click = app_count_click + 1;
                }
            } else if (new dddd01d540d5d40(cnxbvf35d1fd85fd8.this).getCustomAdshowStatus().equals("1")) {
                if (new dddd01d540d5d40(cnxbvf35d1fd85fd8.this).getCountClick() != 0) {
                    app_count_click = app_count_click + 1;
                }
            }

            if (new dddd01d540d5d40(cnxbvf35d1fd85fd8.this).getAdmobInterStatus().equals("1")) {
                if (new dddd01d540d5d40(cnxbvf35d1fd85fd8.this).getCountClickBack() != 0) {
                    app_back_count_click = app_back_count_click + 1;
                }
            } else if (new dddd01d540d5d40(cnxbvf35d1fd85fd8.this).getCustomAdshowStatus().equals("1")) {
                if (new dddd01d540d5d40(cnxbvf35d1fd85fd8.this).getCountClickBack() != 0) {
                    app_back_count_click = app_back_count_click + 1;
                }
            }
            cnxbvdfy7idyfdfd51f4.getManager().preLoadAds(cnxbvf35d1fd85fd8.this);
            if (!new dddd01d540d5d40(cnxbvf35d1fd85fd8.this).getAdmobAppOpenID().isEmpty() && new dddd01d540d5d40(cnxbvf35d1fd85fd8.this).getAdmobAppopenStatusStatus().equals("1")) {
                new bdhubfd67fdft().loadSplashAd(cnxbvf35d1fd85fd8.this, new eereeeeeeee1021() {
                    @Override
                    public void onShowAdComplete() {
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                onComplete();
                            }
                        }, 50);
                    }
                });
            } else {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        onComplete();
                    }
                }, 50);
            }
        } else {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    onComplete();
                }
            }, 50);
        }
    }

    @Override
    public void onBackPressed() {
    }
}
