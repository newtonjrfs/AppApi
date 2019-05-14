package com.example.appapi.model.naveespacial

data class ResultadoNaveEspacial(
        val count: Int?, // 37
        val next: String?, // https://swapi.co/api/starships/?page=2
        val previous: Any?, // null
        val results: List<NaveEspacial>
)