package com.hudak.mthudakpokemon

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hudak.mthudakpokemon.net.PokemonService
import com.hudak.mthudakpokemon.net.obj.Pokemon
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class PokemonViewModel(private val repository: SharedPreferencesRepository) : ViewModel() {

    private val baseURL = "https://pokeapi.co"
    private val _pokemon = MutableLiveData<Pokemon>()
    val pokemon: LiveData<Pokemon> = _pokemon

    fun savePokemonName(name: String) {
        repository.savePokemonName(name)
    }

    fun loadPokemon(name: String) {
        val retrofit = Retrofit.Builder()
            .baseUrl(baseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create(PokemonService::class.java)

        service.getPokemonDetail(name).enqueue(object : Callback<Pokemon> {
            override fun onResponse(call: Call<Pokemon>, response: Response<Pokemon>) {
                if (response.isSuccessful) {
                    _pokemon.postValue(response.body())
                    savePokemonName(name)
                } else {
                    // Handle errors
                }
            }

            override fun onFailure(call: Call<Pokemon>, t: Throwable) {
                // Handle network failures
            }
        })
    }
}
