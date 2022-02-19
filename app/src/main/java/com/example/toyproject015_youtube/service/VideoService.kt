package com.example.toyproject015_youtube.service

import com.example.toyproject015_youtube.dto.VideoDto
import retrofit2.Call
import retrofit2.http.GET

interface VideoService {

    @GET("/v3/eb8c2be6-cbfa-43e0-91f1-384adb4b2a9b")
    fun listVideos(): Call<VideoDto>
}