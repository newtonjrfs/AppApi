package com.example.appapi.model.planetas

data class Planetas(
        val climate: String?, // arid
        val created: String?, // 2014-12-09T13:50:49.641000Z
        val diameter: String?, // 10465
        val edited: String?, // 2014-12-21T20:48:04.175778Z
        val films: List<String>?,
        val gravity: String?, // 1 standard
        val name: String?, // Tatooine
        val orbital_period: String?, // 304
        val population: String?, // 200000
        val residents: List<String?>?,
        val rotation_period: String?, // 23
        val surface_water: String?, // 1
        val terrain: String?, // desert
        val url: String? // https://swapi.co/api/planets/1/
)