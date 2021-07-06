package com.example.caiyun_75.Unitl.OKhttpClick;

import android.content.Context;
import android.widget.Toast;

import com.example.caiyun_75.UI.WeatherPage;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class OKhttpClick {
    public static String get(String url){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();
        try {
           return client.newCall(request).execute().body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
