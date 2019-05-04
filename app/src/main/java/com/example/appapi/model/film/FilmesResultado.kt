package com.example.appapi.model.film


data class FilmesResultado(
        val count: Int, // 87
        val next: String, // https://swapi.co/api/people/?page=2
        val previous: Any, // null
        val results: List<Filmes>?
)