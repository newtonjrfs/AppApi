package com.example.appapi.model.naveespacial

import com.example.appapi.model.film.Filmes

data class NaveEspacial(
        val MGLT: String?, // 40
        val cargo_capacity: String?, // 6000000
        val consumables: String?, // 2 years
        val cost_in_credits: String?, // 8500000
        val created: String?, // 2014-12-15T13:06:30.813000Z
        val crew: String?, // 854
        val edited: String?, // 2014-12-22T17:35:44.848329Z
        val films: List<Filmes>?,
        val hyperdrive_rating: String?, // 2.0
        val length: String?, // 300
        val manufacturer: String?, // Kuat Drive Yards
        val max_atmosphering_speed: String?, // 800
        val model: String?, // EF76 Nebulon-B escort frigate
        val name: String?, // EF76 Nebulon-B escort frigate
        val passengers: String?, // 75
        val pilots: List<Any?>?,
        val starship_class: String?, // Escort ship
        val url: String? // https://swapi.co/api/starships/23/
)