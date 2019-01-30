package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {

    public String date;

    @SerializedName("cond_txt_d")
    public String info;


    @SerializedName("tmp_max")
    public String tmp_max;

    @SerializedName("tmp_min")
    public String tmp_min;

}
