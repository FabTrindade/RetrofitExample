package com.fabscorp.retrofitexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.fabscorp.retrofitexample.ui.theme.RetrofitExampleTheme
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val service = RetrofitClient.createService(PostsService::class.java)
        val call: Call<List<PostsEntity>> = service.list()
        call.enqueue(object : Callback<List<PostsEntity>> { // To put it in the queue. Asyc call
            override fun onResponse(call: Call<List<PostsEntity>>, r: Response<List<PostsEntity>>) {
                val s = ""
            }

            override fun onFailure(call: Call<List<PostsEntity>>, t: Throwable) {
                val s = ""
            }

        })
    }
}
