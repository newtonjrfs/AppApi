package com.example.appapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.appapi.api.Api
import com.example.appapi.model.film.Filmes
import com.example.appapi.model.film.FilmesResultado
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofit = Retrofit.Builder()
                .baseUrl("http://swapi.co/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()


        val apiServices = retrofit.create(Api::class.java)

        val call = apiServices.listFilmes()



        call.enqueue(object : Callback<FilmesResultado> {
            override fun onFailure(call: Call<FilmesResultado>, t: Throwable) {
                Log.d("resposta","on failure")


            }

            override fun onResponse(call: Call<FilmesResultado>, response: Response<FilmesResultado>) {
                Log.d("resposta","on sucess")
                val cont = response.body()!!.count
                var tete = ""
                for (i in 0 .. cont-1){
                    tete = "${tete} \n- " + response.body()?.results?.get(i)?.title
                }

                texto.setText("${tete}")
                //Toast.makeText(this@MainActivity,"${tete}",Toast.LENGTH_LONG).show()
            }
        })

    }
}
