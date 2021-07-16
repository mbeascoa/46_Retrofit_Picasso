package com.example.a46_retrofit_picasso;

import retrofit2.Call;
import retrofit2.http.GET;
import java.util.List;

public interface  RequestInterface {
    @GET("cars_list.json")
    Call<List<CarsModel>> getCarJson();
}