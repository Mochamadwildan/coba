package com.example.mycam.bottom.ui.service;

import com.example.mycam.bottom.model.CategoriItem;
import com.example.mycam.bottom.model.KameraItem;
import com.google.gson.JsonObject;

import java.util.List;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

public interface  Service {
    @FormUrlEncoded
    @POST("kamera/ajax_action_get_kamera")
    Call<List<KameraItem>> getAllCamera(@Field("id") String id);

    @GET("kamera/ajax_action_get_kamera_merk")
    Call<List<CategoriItem>> getAllMerk();


}