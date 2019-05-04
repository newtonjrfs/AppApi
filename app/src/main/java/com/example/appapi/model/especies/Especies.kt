package com.example.appapi.model.especies

import com.example.appapi.model.film.Filmes
import com.example.appapi.model.pessoas.Pessoas

data class Especies(
        val average_height: String?, // 100
        val average_lifespan: String?, // unknown
        val classification: String?, // mammal
        val created: String?, // 2014-12-19T17:53:11.214000Z
        val designation: String?, // sentient
        val edited: String?, // 2014-12-20T21:36:42.167000Z
        val eye_colors: String?, // yellow, blue
        val films: List<Filmes>?,
        val hair_colors: String?, // none
        val homeworld: String?, // https://swapi.co/api/planets/35/
        val language: String?, // Dugese
        val name: String?, // Dug
        val people: List<Pessoas>?,
        val skin_colors: String?, // brown, purple, grey, red
        val url: String? // https://swapi.co/api/species/14/
)