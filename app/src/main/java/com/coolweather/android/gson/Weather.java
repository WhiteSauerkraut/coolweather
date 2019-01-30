package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {

    public String status;

    public Basic basic;

    public Now now;

    public Update update;

    @SerializedName("lifestyle")
    public List<LifeStyle> lifestyleList;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
