package com.example.weather_t.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temerature temerature;

    @SerializedName("cond")
    public More more;

    public class Temerature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
