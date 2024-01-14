package com.hudak.mthudakpokemon

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.hudak.mthudakpokemon.PokemonViewModel

class ViewModelFactory(private val repository: SharedPreferencesRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PokemonViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return PokemonViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
