package com.example.paiduaykanmaiapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.paiduaykanmaiapp.Adapter.EventAdapter;
import com.example.paiduaykanmaiapp.Model.EventModel;
import com.example.paiduaykanmaiapp.databinding.ActivityMainBinding;

import org.json.JSONObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    EventAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        doGetInfo();
        doGetToken();
    }

    private void doGetToken(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(APIInterface.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        APIInterface service = retrofit.create(APIInterface.class);
        Call<JSONObject> call = service.getToken("Bearer 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",
                "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");
        call.enqueue(new Callback<JSONObject>() {
            @Override
            public void onResponse(Call<JSONObject> call, Response<JSONObject> response) {
                if (response.code() == 200 && response.body() != null) {

                }
            }

            @Override
            public void onFailure(Call<JSONObject> call, Throwable t) {
                Log.d("onFailure", t.getMessage());
            }
        });
    }

    private void doGetInfo(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(APIInterface.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        APIInterface service = retrofit.create(APIInterface.class);
        Call<List<EventModel>> call = service.getAllEvent();
        call.enqueue(new Callback<List<EventModel>>() {
            @Override
            public void onResponse(Call<List<EventModel>> call, Response<List<EventModel>> response) {
                if (response.code() == 200 && response.body() != null) {
                    List<EventModel> body = response.body();
                    setListviewAdapter(body);
                }
            }

            @Override
            public void onFailure(Call<List<EventModel>> call, Throwable t) {
                Log.d("onFailure", t.getMessage());
            }
        });
    }

    private void setListviewAdapter(List<EventModel> events){
        adapter = new EventAdapter(events);
        binding.recyclerView.setAdapter(adapter);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(
                this, LinearLayoutManager.VERTICAL, false));
    }

}