package com.example.wallpaper;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class apiUtilities {

    private static  Retrofit retrofit = null;
    public static final String API = "563492ad6f91700001000001aa4dd3f1d2bd4d9ea70adcb75b48d34d";


    public static apiInterface getApiInterface(){
        if(retrofit==null){
            retrofit = new Retrofit.Builder().baseUrl(apiInterface.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit.create(apiInterface.class);
    }
}
