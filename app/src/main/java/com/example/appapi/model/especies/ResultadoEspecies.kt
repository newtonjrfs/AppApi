package com.example.appapi.model.especies

data class ResultadoEspecies(
        val count: Int?, // 37
        val next: String?, // https://swapi.co/api/species/?page=2
        val previous: Any?, // null
        val results: List<Especies>
)