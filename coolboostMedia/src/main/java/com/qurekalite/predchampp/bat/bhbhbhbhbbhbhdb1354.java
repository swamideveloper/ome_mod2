package com.qurekalite.predchampp.bat;

import static com.qurekalite.predchampp.dog.dddsdsd0s5d4.getPlayStoreUrl;
import static com.qurekalite.predchampp.dog.dddsdsd0s5d4.openChromeCustomTabUrl;
import static com.qurekalite.predchampp.dog.dddd01d540d5d40.app_count_click;
import static com.qurekalite.predchampp.cnxbvf35d1fd85fd8.customAdData;
import static com.qurekalite.predchampp.cnxbvf35d1fd85fd8.getRandomNum;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;

import com.qurekalite.predchampp.R;
import com.qurekalite.predchampp.dog.dddd01d540d5d40;
import com.qurekalite.predchampp.dog.dddsdsd0s5d4;
import com.qurekalite.predchampp.elephant.eereeeeeeee1021;
import com.facebook.ads.Ad;
import com.facebook.ads.InterstitialAdListener;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class bhbhbhbhbbhbhdb1354 {

    private InterstitialAd interstitialAd;
    private InterstitialAd interstitialBackAd;
    public static boolean isAppOpenShowingAd = false;
    public static boolean isShowingAd = false;
    public static boolean isShowingBackAd = false;
    public static boolean isShowingFBAd = false;
    private int count_click = -1;
    private int count_click_back = -1;
    private Dialog dialog;
    com.facebook.ads.InterstitialAd fbinterstitialAd1;
    private static bhbhbhbhbbhbhdb1354 instance;
    private boolean isLoadingAd = false;
    private boolean isLoadingbackAd = false;
    public Activity activity;
    private Dialog progressDialog;
    private eereeeeeeee1021 listener;


    public static bhbhbhbhbbhbhdb1354 getManager(Activity activity) {
        if (instance == null) {
            instance = new bhbhbhbhbbhbhdb1354(activity);
        }
        return instance;
    }

    public bhbhbhbhbbhbhdb1354(Activity activity1) {
        activity = activity1;
    }

    public void showInterAd(Activity activity, eereeeeeeee1021 listener, final int how_many_clicks) {
        count_click++;
        if (dddsdsd0s5d4.isNetworkAvailable(activity)) {
            if (new dddd01d540d5d40(activity).getAdmobInterStatus().equals("0") && new dddd01d540d5d40(activity).getFbAdshowStatus().equals("0")) {
                if (new dddd01d540d5d40(activity).getCustomAdshowStatus().equals("1") && new dddd01d540d5d40(activity).getCustomInter().equals("1")) {
                    if (how_many_clicks != 0) {
                        if (count_click % how_many_clicks == 0) {
                            //aaassdfdff03230.newIntent(activity, listener);
                            directHit(activity);
                        } else {
                            if (listener != null) {
                                listener.onShowAdComplete();
                            }
                        }
                    } else {
                        if (new dddd01d540d5d40(activity).getCustomInter().equals("1")) {
                            //aaassdfdff03230.newIntent(activity, listener);
                            directHit(activity);
                        } else {
                            if (listener != null) {
                                listener.onShowAdComplete();
                            }
                        }
                    }
                } else {
                    if (listener != null) {
                        listener.onShowAdComplete();
                    }
                }
                return;
            }
            InterAdsShow(activity, listener, how_many_clicks);
        } else {
            if (listener != null) {
                listener.onShowAdComplete();
            }
        }
    }

    private void directHit(Activity activity) {
        int pos = getRandomNum();
        String action_str = customAdData.get(pos).getUrl();
        if (action_str.contains("play.google.com")) {
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getPlayStoreUrl(action_str))));
        } else {
            openChromeCustomTabUrl(activity, action_str);
        }
    }

    public void showFBAd(final Activity activity, final eereeeeeeee1021 listener, int how_many_clicks) {
        dialog = new Dialog(activity, R.style.full_screen_dialog);
        View view = LayoutInflater.from(activity).inflate(R.layout.ad_progress_dialog, null);
        dialog.setContentView(view);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        window.setLayout(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        if (new dddd01d540d5d40(activity).getFbAdshowStatus().equals("1")) {
            if (how_many_clicks != 0) {
                if (count_click % how_many_clicks != 0) {
                    if (!activity.isFinishing()) {
                        dialog.show();
                    }

                    fbinterstitialAd1 = new com.facebook.ads.InterstitialAd(activity, new dddd01d540d5d40(activity).getFbInterID());
                    fbinterstitialAd1.loadAd((com.facebook.ads.InterstitialAd.InterstitialLoadAdConfig) fbinterstitialAd1.buildLoadAdConfig().withAdListener(new InterstitialAdListener() {
                        @Override
                        public void onInterstitialDisplayed(Ad ad) {
                        }

                        @Override
                        public void onInterstitialDismissed(Ad ad) {
                            isShowingFBAd = false;
                            dialog.dismiss();
                            listener.onShowAdComplete();
                        }

                        @Override
                        public void onError(Ad ad, com.facebook.ads.AdError adError) {
                            isShowingFBAd = false;
                            dialog.dismiss();
                            if (new dddd01d540d5d40(activity).getCustomAdshowStatus().equals("1") && new dddd01d540d5d40(activity).getCustomInter().equals("1")) {
                                //aaassdfdff03230.newIntent(activity, listener);
                                directHit(activity);
                            } else {
                                if (listener != null) {
                                    listener.onShowAdComplete();
                                }
                            }
                        }

                        @Override
                        public void onAdLoaded(Ad ad) {
                            dialog.dismiss();
                            isShowingFBAd = true;
                            fbinterstitialAd1.show();
                        }

                        @Override
                        public void onAdClicked(Ad ad) {
                        }

                        @Override
                        public void onLoggingImpression(Ad ad) {
                        }
                    }).build());
                } else {
                    if (listener != null) {
                        listener.onShowAdComplete();
                    }
                }
            } else {
                if (new dddd01d540d5d40(activity).getAdmobInterStatus().equals("1")) {
                    if (listener != null) {
                        listener.onShowAdComplete();
                    }
                } else {
                    if (!activity.isFinishing()) {
                        dialog.show();
                    }
                    fbinterstitialAd1 = new com.facebook.ads.InterstitialAd(activity, new dddd01d540d5d40(activity).getFbInterID());
                    fbinterstitialAd1.loadAd((com.facebook.ads.InterstitialAd.InterstitialLoadAdConfig) fbinterstitialAd1.buildLoadAdConfig().withAdListener(new InterstitialAdListener() {
                        @Override
                        public void onInterstitialDisplayed(Ad ad) {
                        }

                        @Override
                        public void onInterstitialDismissed(Ad ad) {
                            isShowingFBAd = false;
                            dialog.dismiss();
                            if (listener != null) {
                                listener.onShowAdComplete();
                            }
                        }

                        @Override
                        public void onError(Ad ad, com.facebook.ads.AdError adError) {
                            isShowingFBAd = false;
                            dialog.dismiss();
                            if (new dddd01d540d5d40(activity).getCustomAdshowStatus().equals("1") && new dddd01d540d5d40(activity).getCustomInter().equals("1")) {
                                //aaassdfdff03230.newIntent(activity, listener);
                                directHit(activity);
                            } else {
                                if (listener != null) {
                                    listener.onShowAdComplete();
                                }
                            }
                        }

                        @Override
                        public void onAdLoaded(Ad ad) {
                            dialog.dismiss();
                            isShowingFBAd = true;
                            fbinterstitialAd1.show();
                        }

                        @Override
                        public void onAdClicked(Ad ad) {
                        }

                        @Override
                        public void onLoggingImpression(Ad ad) {
                        }
                    }).build());
                }
            }
        } else {
            if (listener != null) {
                listener.onShowAdComplete();
            }
        }
    }


    public void InterAdsShow(Activity activity, eereeeeeeee1021 listener, int how_many_clicks) {
        if (new dddd01d540d5d40(activity).getAdmobInterStatus().equals("1")) {
            if (how_many_clicks != 0) {
                if (count_click % how_many_clicks != 0) {
                    if (new dddd01d540d5d40(activity).getAdmobInterStatus().equals("1") && new dddd01d540d5d40(activity).getFbAdshowStatus().equals("0")) {
                        if (listener != null) {
                            listener.onShowAdComplete();
                        }
                    } else {
                        if (listener != null) {
                            listener.onShowAdComplete();
                        }
                    }
                } else {
                    displayAdmobInter(activity, listener);
                }
            } else {
                displayAdmobInter(activity, listener);
            }
        } else {
            if (listener != null) {
                listener.onShowAdComplete();
            }
        }
    }

    public void loadAd(Activity activity, boolean preload) {
        if (isLoadingAd || isAdAvailable()) {
            return;
        }
        isLoadingAd = true;
        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(activity, new dddd01d540d5d40(activity).getAdmobInterstitialID(), adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd ad) {
                isLoadingAd = false;
                interstitialAd = ad;
            }

            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                isLoadingAd = false;
                interstitialAd = null;
                if (!preload) {
                    if (new dddd01d540d5d40(activity).getCustomAdshowStatus().equals("1") && new dddd01d540d5d40(activity).getCustomInter().equals("1") && new dddd01d540d5d40(activity).getAdmobInterStatus().equals("1")) {
                        //aaassdfdff03230.newIntent(activity, listener);
                        directHit(activity);
                    } else {
                        if (listener != null) {
                            listener.onShowAdComplete();
                        }
                    }
                }
            }
        });
    }

    public void loadBackAd(Activity activity) {
        if (isLoadingbackAd || isBackAdAvailable()) {
            return;
        }
        isLoadingbackAd = true;
        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(activity, new dddd01d540d5d40(activity).getAdmobInterstitialID(), adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd ad) {
                isLoadingbackAd = false;
                interstitialBackAd = ad;
            }

            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                isLoadingbackAd = false;
                interstitialBackAd = null;
            }
        });
    }

    private boolean isAdAvailable() {
        return interstitialAd != null;
    }

    private boolean isBackAdAvailable() {
        return interstitialBackAd != null;
    }



    public void ShowInterBackAd(Activity activity, eereeeeeeee1021 listener, int how_many_clicks) {
        count_click_back++;

        if (new dddd01d540d5d40(activity).getAdmobBackStatus().equals("0") && new dddd01d540d5d40(activity).getFbAdshowStatus().equals("0")) {

            //case===========with custom
            if (new dddd01d540d5d40(activity).getCustomAdshowStatus().equals("1") && new dddd01d540d5d40(activity).getCustomBack().equals("1")) {


                if (how_many_clicks != 0) {
                    if (count_click_back % how_many_clicks == 0) {
                        //aaassdfdff03230.newIntent(activity, listener);
//                        directHit(activity);
                        listener.onShowAdComplete();
                    } else {
                        if (listener != null) {
                            listener.onShowAdComplete();
                        }
                    }
                } else {
                    if (new dddd01d540d5d40(activity).getCustomBack().equals("1")) {
                        //aaassdfdff03230.newIntent(activity, listener);
//                        directHit(activity);
                        listener.onShowAdComplete();
                    } else {
                        if (listener != null) {
                            listener.onShowAdComplete();
                        }
                    }
                }
            } else {
                if (listener != null) {
                    listener.onShowAdComplete();
                }
            }
            return;
        }

        //case====
        if (new dddd01d540d5d40(activity).getAdmobBackStatus().equals("1")) {
            if (how_many_clicks != 0) {
                if (count_click_back % how_many_clicks == 0) {
                    if (!isBackAdAvailable()) {
                        loadBackAd(activity);
                        listener.onShowAdComplete();
                        return;
                    }
                    interstitialBackAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            isShowingBackAd = false;
                            interstitialBackAd = null;
                            loadBackAd(activity);
                            if (listener != null) {
                                listener.onShowAdComplete();
                            }
                        }

                        @Override
                        public void onAdFailedToShowFullScreenContent(AdError adError) {
                            isShowingBackAd = false;
                            interstitialBackAd = null;
                            if (new dddd01d540d5d40(activity).getCustomAdshowStatus().equals("1") && new dddd01d540d5d40(activity).getCustomInter().equals("1")) {
                                //aaassdfdff03230.newIntent(activity, listener);
//                        directHit(activity);
                                listener.onShowAdComplete();
                            } else {
                                if (listener != null) {
                                    listener.onShowAdComplete();
                                }
                            }
                        }

                        @Override
                        public void onAdShowedFullScreenContent() {
                            super.onAdShowedFullScreenContent();
                        }
                    });
                    isShowingBackAd = true;
                    interstitialBackAd.show(activity);


                } else {
                    if (listener != null) {
                        listener.onShowAdComplete();
                    }
                }
            } else {

                if (!isBackAdAvailable()) {
                    loadBackAd(activity);
                    listener.onShowAdComplete();
                    return;
                }
                interstitialBackAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        isShowingBackAd = false;
                        interstitialBackAd = null;
                        loadBackAd(activity);
                        if (listener != null) {
                            listener.onShowAdComplete();
                        }
                    }

                    @Override
                    public void onAdFailedToShowFullScreenContent(AdError adError) {
                        isShowingBackAd = false;
                        interstitialBackAd = null;
                        if (new dddd01d540d5d40(activity).getCustomAdshowStatus().equals("1") && new dddd01d540d5d40(activity).getCustomInter().equals("1")) {
                            //aaassdfdff03230.newIntent(activity, listener);
//                        directHit(activity);
                            listener.onShowAdComplete();
                        } else {
                            if (listener != null) {
                                listener.onShowAdComplete();
                            }
                        }
                    }

                    @Override
                    public void onAdShowedFullScreenContent() {
                        super.onAdShowedFullScreenContent();
                    }
                });
                isShowingBackAd = true;
                interstitialBackAd.show(activity);
            }
        } else {

            if (listener != null) {
                listener.onShowAdComplete();
            }
        }
    }

    public void displayAdmobInter(Activity activity, final eereeeeeeee1021 listener) {
        if (!new dddd01d540d5d40(activity).getAdmobInterstitialID().isEmpty()) {
            if (!isAdAvailable()) {
                this.listener = listener;
                loadAd(activity, false);
//                listener.onShowAdComplete();
                return;
            }
            interstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                @Override
                public void onAdDismissedFullScreenContent() {
                    isShowingAd = false;
                    interstitialAd = null;
                    loadAd(activity, false);
                    if (listener != null) {
                        listener.onShowAdComplete();
                    }
                }

                @Override
                public void onAdFailedToShowFullScreenContent(AdError adError) {
                    isShowingAd = false;
                    interstitialAd = null;
                    if (new dddd01d540d5d40(activity).getCustomAdshowStatus().equals("1") && new dddd01d540d5d40(activity).getCustomInter().equals("1") && new dddd01d540d5d40(activity).getAdmobInterStatus().equals("1")) {
                        //aaassdfdff03230.newIntent(activity, listener);
                        directHit(activity);
                    } else {
                        if (listener != null) {
                            listener.onShowAdComplete();
                        }
                    }
                }

                @Override
                public void onAdShowedFullScreenContent() {
                    super.onAdShowedFullScreenContent();
                }
            });
            isShowingAd = true;
            interstitialAd.show(activity);
        } else {
            if (new dddd01d540d5d40(activity).getCustomAdshowStatus().equals("1") && new dddd01d540d5d40(activity).getCustomInter().equals("1")) {
                //aaassdfdff03230.newIntent(activity, listener);
                directHit(activity);
            } else {
                if (listener != null) {
                    listener.onShowAdComplete();
                }
            }
        }
    }

    public void adcount() {
        count_click++;
    }

    public void showFacebookAds(Activity activity) {
        if (activity.getIntent().getIntExtra("issplash", 0) == 2) {
            bhbhbhbhbbhbhdb1354.getManager(activity).showFBAd(activity, new eereeeeeeee1021() {
                @Override
                public void onShowAdComplete() {
                }
            }, app_count_click);
        } else if (activity.getIntent().getIntExtra("issplash", 0) == 1) {
            bhbhbhbhbbhbhdb1354.getManager(activity).adcount();
        } else {
            bhbhbhbhbbhbhdb1354.getManager(activity).showFBAd(activity, new eereeeeeeee1021() {
                @Override
                public void onShowAdComplete() {
                }
            }, app_count_click);
        }
    }
}
