package com.example.proj17_melon.service

import retrofit2.Call
import retrofit2.http.GET

interface MusicService {

    @GET("/v3/cce2d5b1-fa56-429e-af87-7f2f2f6701c4")
    fun listMusics() : Call<MusicDto>
}