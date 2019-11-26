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
//            OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
//            HttpLoggingInterceptor logger = new HttpLoggingInterceptor();
//            logger.setLevel(HttpLoggingInterceptor.Level.HEADERS);
//            logger.setLevel(HttpLoggingInterceptor.Level.BODY);
//            httpClient.addInterceptor(logger);
//
//            httpClient.addInterceptor(chain -> {
//                Request request = chain.request().newBuilder()
//                        .header("UserBody-Agent", "android")
//                        .addHeader("Content-Type", "application/json")
////                        .addHeader("token", Constants.token)
//                        //.method(original.method(), original.body())
//                        .build();
//
//                return chain.proceed(request);
//            });
//
//            OkHttpClient client = httpClient.build();


            Retrofit retrofit = new Retrofit.Builder()
//                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(Constants.API_URL)
                    .build();
            return retrofit.create(ApiService.class);
        }
    }
}
