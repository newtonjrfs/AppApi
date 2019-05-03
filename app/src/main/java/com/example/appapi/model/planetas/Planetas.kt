package com.example.appapi.model.planetas

import com.example.appapi.model.film.Filmes

data class Planetas(
        val climate: String?, // temperate, arid
        val created: String?, // 2014-12-10T12:47:22.350000Z
        val diameter: String?, // 11370
        val edited: String?, // 2014-12-20T20:58:18.437000Z
        val films: List<Filmes>?,
        val gravity: String?, // 0.9 standard
        val name: String?, // Geonosis
        val orbital_period: String?, // 256
        val population: String?, // 100000000000
        val residents: List<String?>?,
        val rotation_period: String?, // 30
        val surface_water: String?, // 5
        val terrain: String?, // rock, desert, mountain, barren
        val url: String? // https://swapi.co/api/planets/11/
)