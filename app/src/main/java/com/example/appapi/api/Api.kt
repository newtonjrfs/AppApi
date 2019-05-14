package com.example.appapi.api

import com.example.appapi.model.especies.ResultadoEspecies
import com.example.appapi.model.film.FilmesResultado
import com.example.appapi.model.naveespacial.ResultadoNaveEspacial
import com.example.appapi.model.pessoas.PessoasResultados
import com.example.appapi.model.planetas.ResultadoPlanetas
import com.example.appapi.model.veiculos.ResultadoVeiculos
import retrofit2.Call
import retrofit2.http.GET

interface Api {

    @GET("films/")
    fun listFilmes() : Call<FilmesResultado>

    @GET("planets/")
    fun listPlanetas() : Call<ResultadoPlanetas>

    @GET("people/")
    fun listPessoas() : Call<PessoasResultados>

    @GET("species/")
    fun listEspecies() : Call<ResultadoEspecies>

    @GET("vehicles/")
    fun listVeiculos() : Call<ResultadoVeiculos>

    @GET("starships/")
    fun listNave() : Call<ResultadoNaveEspacial>

}