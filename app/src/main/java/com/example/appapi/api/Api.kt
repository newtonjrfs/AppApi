package com.example.appapi.api

import com.example.appapi.model.film.FilmesResultado
import retrofit2.Call
import retrofit2.http.GET

interface Api {

    @GET("films/")
    fun listFilmes() : Call<FilmesResultado>

}