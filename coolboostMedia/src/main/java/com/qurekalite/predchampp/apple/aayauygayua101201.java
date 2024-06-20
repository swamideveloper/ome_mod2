package com.qurekalite.predchampp.apple;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class aayauygayua101201 {
    @SerializedName("OmeGirl_VideoChat_with_CoolbootsMedia__Mod2__cust_id")
    @Expose
    private String id;
    @SerializedName("OmeGirl_VideoChat_with_CoolbootsMedia__Mod2__cust_name")
    @Expose
    private String name;
    @SerializedName("OmeGirl_VideoChat_with_CoolbootsMedia__Mod2__cust_url")
    @Expose
    private String url;
    @SerializedName("OmeGirl_VideoChat_with_CoolbootsMedia__Mod2__cust_appopen_image")
    @Expose
    private String appopenImage;
    @SerializedName("OmeGirl_VideoChat_with_CoolbootsMedia__Mod2__cust_interstitial_image")
    @Expose
    private String interstitialImage;
    @SerializedName("OmeGirl_VideoChat_with_CoolbootsMedia__Mod2__cust_small_native_image")
    @Expose
    private String smallNativeImage;
    @SerializedName("OmeGirl_VideoChat_with_CoolbootsMedia__Mod2__cust_native_image")
    @Expose
    private String nativeImage;

    public aayauygayua101201(String id, String name, String url, String appopenImage, String interstitialImage, String smallNativeImage, String nativeImage) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.appopenImage = appopenImage;
        this.interstitialImage = interstitialImage;
        this.smallNativeImage = smallNativeImage;
        this.nativeImage = nativeImage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAppopenImage() {
        return appopenImage;
    }

    public void setAppopenImage(String appopenImage) {
        this.appopenImage = appopenImage;
    }

    public String getInterstitialImage() {
        return interstitialImage;
    }

    public void setInterstitialImage(String interstitialImage) {
        this.interstitialImage = interstitialImage;
    }

    public String getSmallNativeImage() {
        return smallNativeImage;
    }

    public void setSmallNativeImage(String smallNativeImage) {
        this.smallNativeImage = smallNativeImage;
    }

    public String getNativeImage() {
        return nativeImage;
    }

    public void setNativeImage(String nativeImage) {
        this.nativeImage = nativeImage;
    }

}
