package com.example.appapi.model.pessoas

import com.example.appapi.model.film.Filmes

data class PessoasResultados(
        val count: Int?, // 7
        val next: Any?, // null
        val previous: Any?, // null
        val filmes: List<Pessoas>?
)