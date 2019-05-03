package com.example.appapi.model.pessoas

import com.example.appapi.model.especies.Especies
import com.example.appapi.model.film.Filmes
import com.example.appapi.model.naveespacial.NaveEspacial

data class Pessoas(
        val birth_year: String?, // 57BBY
        val created: String?, // 2014-12-10T16:16:29.192000Z
        val edited: String?, // 2014-12-20T21:17:50.325000Z
        val eye_color: String?, // blue-gray
        val films: List<Filmes>?,
        val gender: String?, // male
        val hair_color: String?, // auburn, white
        val height: String?, // 182
        val homeworld: String?, // https://swapi.co/api/planets/20/
        val mass: String?, // 77
        val name: String?, // Obi-Wan Kenobi
        val skin_color: String?, // fair
        val species: List<Especies>?,
        val starships: List<NaveEspacial>?,
        val url: String?, // https://swapi.co/api/people/10/
        val vehicles: List<String?>?
)