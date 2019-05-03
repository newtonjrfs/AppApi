package com.example.appapi.model.film

import com.example.appapi.model.especies.Especies
import com.example.appapi.model.naveespacial.NaveEspacial
import com.example.appapi.model.pessoas.Pessoas
import com.example.appapi.model.planetas.Planetas
import com.example.appapi.model.veiculos.Veiculos

data class Filmes(
        val characters: List<Pessoas>?,
        val created: String?, // 2015-04-17T06:51:30.504780Z
        val director: String?, // J. J. Abrams
        val edited: String?, // 2015-12-17T14:31:47.617768Z
        val episode_id: Int?, // 7
        val opening_crawl: String?, // Luke Skywalker has vanished.In his absence, the sinisterFIRST ORDER has risen fromthe ashes of the Empireand will not rest untilSkywalker, the last Jedi,has been destroyed. With the support of theREPUBLIC, General Leia Organaleads a brave RESISTANCE.She is desperate to find herbrother Luke and gain hishelp in restoring peace andjustice to the galaxy. Leia has sent her most daringpilot on a secret missionto Jakku, where an old allyhas discovered a clue toLuke's whereabouts....
        val planets: List<Planetas>?,
        val producer: String?, // Kathleen Kennedy, J. J. Abrams, Bryan Burk
        val release_date: String?, // 2015-12-11
        val species: List<Especies>?,
        val starships: List<NaveEspacial>?,
        val title: String?, // The Force Awakens
        val url: String?, // https://swapi.co/api/films/7/
        val vehicles: List<Veiculos>?
)