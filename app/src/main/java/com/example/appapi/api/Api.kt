package com.example.appapi.api

import com.example.appapi.model.film.FilmesResultado
import com.example.appapi.model.pessoas.PessoasResultados
import com.example.appapi.model.planetas.ResultadoPlanetas
import retrofit2.Call
import retrofit2.http.GET

interface Api {

    @GET("films/")
    fun listFilmes() : Call<FilmesResultado>

    @GET("planets/")
    fun listPlanetas() : Call<ResultadoPlanetas>

    @GET("people/")
    fun listPessoas() : Call<PessoasResultados>

}