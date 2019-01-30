package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class AQI {

    public String status;

    @SerializedName("air_now_city")
    public AQICity air_city;

    public class AQICity{

        public String aqi;

        public String pm25;
    }
}
