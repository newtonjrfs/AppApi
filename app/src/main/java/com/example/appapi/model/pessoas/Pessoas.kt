package com.example.appapi.model.pessoas

data class Pessoas(
    val birth_year: String?, // 33BBY
    val created: String?, // 2014-12-10T15:11:50.376000Z
    val edited: String?, // 2014-12-20T21:17:50.311000Z
    val eye_color: String?, // red
    val films: List<String?>?,
    val gender: String?, // n/a
    val hair_color: String?, // n/a
    val height: String?, // 96
    val homeworld: String?, // https://swapi.co/api/planets/8/
    val mass: String?, // 32
    val name: String?, // R2-D2
    val skin_color: String?, // white, blue
    val species: List<String?>?,
    val starships: List<Any?>?,
    val url: String?, // https://swapi.co/api/people/3/
    val vehicles: List<Any?>?
)