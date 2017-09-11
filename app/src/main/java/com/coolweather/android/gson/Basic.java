package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Admin on 2017/9/10.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
