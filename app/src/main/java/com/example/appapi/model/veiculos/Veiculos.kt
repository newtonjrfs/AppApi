package com.example.appapi.model.veiculos

import com.example.appapi.model.film.Filmes

data class Veiculos(
        val cargo_capacity: String?, // 2000000
        val consumables: String?, // Live food tanks
        val cost_in_credits: String?, // 285000
        val created: String?, // 2014-12-18T10:44:14.217000Z
        val crew: String?, // 26
        val edited: String?, // 2014-12-22T18:21:15.807906Z
        val films: List<Filmes>?,
        val length: String?, // 30
        val manufacturer: String?, // Ubrikkian Industries Custom Vehicle Division
        val max_atmosphering_speed: String?, // 100
        val model: String?, // Modified Luxury Sail Barge
        val name: String?, // Sail barge
        val passengers: String?, // 500
        val pilots: List<Any?>?,
        val url: String?, // https://swapi.co/api/vehicles/24/
        val vehicle_class: String? // sail barge
)