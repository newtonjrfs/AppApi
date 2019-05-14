package com.example.appapi.model.naveespacial

data class NaveEspacial(
    val MGLT: String?, // 40
    val cargo_capacity: String?, // 250000000
    val consumables: String?, // 6 years
    val cost_in_credits: String?, // 1143350000
    val created: String?, // 2014-12-15T12:31:42.547000Z
    val crew: String?, // 279144
    val edited: String?, // 2017-04-19T10:56:06.685592Z
    val films: List<String?>?,
    val hyperdrive_rating: String?, // 2.0
    val length: String?, // 19000
    val manufacturer: String?, // Kuat Drive Yards, Fondor Shipyards
    val max_atmosphering_speed: String?, // n/a
    val model: String?, // Executor-class star dreadnought
    val name: String?, // Executor
    val passengers: String?, // 38000
    val pilots: List<Any?>?,
    val starship_class: String?, // Star dreadnought
    val url: String? // https://swapi.co/api/starships/15/
)