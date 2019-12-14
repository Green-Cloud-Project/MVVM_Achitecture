package com.share.mvvm_architecture.data.remote.api;

import com.share.mvvm_architecture.data.model.RentalSpot;
import com.share.mvvm_architecture.utils.Constants;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface ApiService {
    @GET("findRentalOffice")
    Call<List<RentalSpot>> getRentalOffices();

    class Creator {
        public static ApiService create() {
            Retrofit retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(Constants.API_URL)
                    .build();
            return retrofit.create(ApiService.class);
        }
    }
}
