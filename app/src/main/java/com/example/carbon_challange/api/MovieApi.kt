package com.example.carbon_challange.api

import com.example.carbon_challange.data.MovieResponse
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

/**
 *@Created by Yerimah on 9/23/2021.
 */
interface MovieApi {

    companion object {
        const val BASE_URL = "https://api.themoviedb.org/4/"
        const val API_KEY = "a7ad6458b8de544577ddb8d21afa4426"
    }

    @Headers("Content-Type", "application/json;charset=utf-8")
    @GET("list/1")
    suspend fun searchPhotos(
        @Query("page") page: Int,
        @Query("api_key") perPage: String = API_KEY
    ): MovieResponse
}