package com.example.appapi.model.especies

data class Especies(
    val average_height: String?, // 210
    val average_lifespan: String?, // 400
    val classification: String?, // mammal
    val created: String?, // 2014-12-10T16:44:31.486000Z
    val designation: String?, // sentient
    val edited: String?, // 2015-01-30T21:23:03.074598Z
    val eye_colors: String?, // blue, green, yellow, brown, golden, red
    val films: List<String?>?,
    val hair_colors: String?, // black, brown
    val homeworld: String?, // https://swapi.co/api/planets/14/
    val language: String?, // Shyriiwook
    val name: String?, // Wookiee
    val people: List<String?>?,
    val skin_colors: String?, // gray
    val url: String? // https://swapi.co/api/species/3/
)