package com.example.appapi.model.veiculos

data class ResultadoVeiculos(
        val count: Int?, // 39
        val next: String?, // https://swapi.co/api/vehicles/?page=2
        val previous: Any?, // null
        val results: List<Veiculos?>?
)