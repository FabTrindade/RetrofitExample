package com.fabscorp.retrofitexample

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {


    //Singleton
    companion object {
        private lateinit var INSTANCE: Retrofit
        private const val BASE_URL = "https://jsonplaceholder.typicode.com/"

        private fun getRetrofitInstance(): Retrofit {
            val http = OkHttpClient.Builder()
            if (!::INSTANCE.isInitialized) {
                INSTANCE = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(http.build())
                    .addConverterFactory(GsonConverterFactory.create())//Json <-> Kotlin Interface
                    .build()
            }
            return INSTANCE
        }

        fun <S> createService(c : Class<S>): S {
            return getRetrofitInstance().create(c)
        }
    }
}