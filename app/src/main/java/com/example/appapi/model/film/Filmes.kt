package com.example.appapi.model.film

data class Filmes(
        val characters: List<String?>?,
        val created: String?, // 2014-12-10T14:23:31.880000Z
        val director: String?, // George Lucas
        val edited: String?, // 2014-12-12T11:24:39.858000Z
        val episode_id: Int?, // 4
        val opening_crawl: String?, // It is a period of civil war.Rebel spaceships, strikingfrom a hidden base, have wontheir first victory againstthe evil Galactic Empire.During the battle, Rebelspies managed to steal secretplans to the Empire'sultimate weapon, the DEATHSTAR, an armored spacestation with enough powerto destroy an entire planet.Pursued by the Empire'ssinister agents, PrincessLeia races home aboard herstarship, custodian of thestolen plans that can save herpeople and restorefreedom to the galaxy....
        val planets: List<String?>?,
        val producer: String?, // Gary Kurtz, Rick McCallum
        val release_date: String?, // 1977-05-25
        val species: List<String?>?,
        val starships: List<String?>?,
        val title: String?, // A New Hope
        val url: String?, // https://swapi.co/api/films/1/
        val vehicles: List<String?>?
)