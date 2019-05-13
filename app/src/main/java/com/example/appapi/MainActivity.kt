package com.example.appapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.appapi.api.Api
import com.example.appapi.model.film.Filmes
import com.example.appapi.model.film.FilmesResultado
import com.example.appapi.model.pessoas.PessoasResultados
import com.example.appapi.model.planetas.ResultadoPlanetas
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
        val callPlanetas = apiServices.listPlanetas()
        val callPessoas = apiServices.listPessoas()

        btnFilmes.setOnClickListener { clickFilmes(call) }

        btnPlanetas.setOnClickListener { clickPlanetas(callPlanetas) }

        btnPessoas.setOnClickListener { clickPessoas(callPessoas) }






    }

    private fun clickPessoas(callPessoas: Call<PessoasResultados>) {
        callPessoas.enqueue(object :  Callback<PessoasResultados> {
            override fun onFailure(call: Call<PessoasResultados>, t: Throwable) {
                texto.setText("erro")
            }

            override fun onResponse(call: Call<PessoasResultados>, response: Response<PessoasResultados>) {
                val contPessoas = response.body()!!.results
                val sizePessoas = contPessoas.size

                var pessoasResposta = ""

                for (i in 0 .. sizePessoas - 1){
                    pessoasResposta = "${pessoasResposta} - ${contPessoas[i].name}\n"
                }

                texto.setText(pessoasResposta)
            }


        })
    }

    private fun clickPlanetas(callPlanetas: Call<ResultadoPlanetas>) {
        callPlanetas.enqueue(object : Callback<ResultadoPlanetas>{
            override fun onResponse(call: Call<ResultadoPlanetas>, response: Response<ResultadoPlanetas>) {
                val contPlaneta = response.body()!!.results
                val sizePlanetas = contPlaneta.size
                var planetaResposta = ""
                for (i in 0 .. sizePlanetas-1){
                    planetaResposta = "${planetaResposta} - ${contPlaneta[i].name}\n"
                }

                texto.setText(planetaResposta)
            }

            override fun onFailure(call: Call<ResultadoPlanetas>, t: Throwable) {
                texto.setText("Erro ")
            }
        })

    }

    private fun clickFilmes(call: Call<FilmesResultado>) {
        call.enqueue(object : Callback<FilmesResultado> {
            override fun onFailure(call: Call<FilmesResultado>, t: Throwable) {
                Log.d("resposta","on failure")
                texto.setText("erro")

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
