package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {

    //@SerializedName:让JSON字段和Java字段之间建设映射关系
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
