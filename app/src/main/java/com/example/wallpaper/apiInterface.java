package com.example.wallpaper;

import static com.example.wallpaper.apiUtilities.API;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface apiInterface {

    String BASE_URL = "https://api.pexels.com/v1/";

    @Headers("Authorization: "+API)
    @GET("curated")
    Call<searchModel> getImage(
            @Query("page") int page,
            @Query("per_page") int per_page
    );

    @Headers("Authorization: "+API)
    @GET("search")
    Call<searchModel> getSearchImage(
            @Query("query") String query,
            @Query("page") int page,
            @Query("per_page") int per_page
    );
}
