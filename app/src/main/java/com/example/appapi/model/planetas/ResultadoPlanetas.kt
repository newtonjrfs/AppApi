package com.example.appapi.model.planetas

data class ResultadoPlanetas(
        val count: Int, // 61
        val next: String, // https://swapi.co/api/planets/?page=2
        val previous: Any, // null
        val results: List<Planetas>
)