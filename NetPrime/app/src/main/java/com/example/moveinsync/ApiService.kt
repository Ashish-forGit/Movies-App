package com.example.moveinsync

import retrofit2.Call
import retrofit2.http.GET

interface MovieApiService {
    @GET("5a50100a-4d54-4368-9560-c1af8d23d0e0")
    suspend fun getMovies(): List<Movie>
}
