package com.fabscorp.retrofitexample

import retrofit2.Call
import retrofit2.http.GET

interface PostsService {

    @GET ("posts")
    fun list (): Call<List<PostsEntity>>
}