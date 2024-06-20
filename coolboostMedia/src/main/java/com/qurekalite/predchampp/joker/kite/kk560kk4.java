
package com.qurekalite.predchampp.joker.kite;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class kk560kk4 {

    @SerializedName("Notification_Time")
    @Expose
    private String notificationTime;
    @SerializedName("Notification_Data")
    @Expose
    private List<kk098k05> notificationData;

    public String getNotificationTime() {
        return notificationTime;
    }

    public void setNotificationTime(String notificationTime) {
        this.notificationTime = notificationTime;
    }

    public List<kk098k05> getNotificationData() {
        return notificationData;
    }

    public void setNotificationData(List<kk098k05> notificationData) {
        this.notificationData = notificationData;
    }

}
