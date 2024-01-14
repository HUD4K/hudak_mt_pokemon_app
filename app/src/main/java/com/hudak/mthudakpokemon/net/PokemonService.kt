package com.hudak.mthudakpokemon.net

import com.hudak.mthudakpokemon.net.obj.Pokemon
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonService {

    @GET("api/v2/pokemon/{pokemon}")
    fun getPokemonDetail(@Path("pokemon") pokemonName: String): Call<Pokemon>
}