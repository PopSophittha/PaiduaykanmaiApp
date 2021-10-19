package com.example.paiduaykanmaiapp;

import com.example.paiduaykanmaiapp.Model.EventModel;

import org.json.JSONObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface APIInterface {

    String BASE_URL = "https://api.github.com";

    @GET("/events")
    Call<List<EventModel>> getAllEvent();

 @GET("/?")
    Call<JSONObject> getToken(@Header("authorization") String content_type, @Query("access_token") String token);

}
