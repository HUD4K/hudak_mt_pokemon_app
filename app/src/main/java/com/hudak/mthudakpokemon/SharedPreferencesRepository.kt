package com.hudak.mthudakpokemon

import android.content.Context
import android.content.SharedPreferences

class SharedPreferencesRepository(context: Context) {
    private val sharedPreferences: SharedPreferences = context.getSharedPreferences("preferencespokemon", Context.MODE_PRIVATE)

    fun savePokemonName(name: String) {
        val editor = sharedPreferences.edit()
        val timestamp = System.currentTimeMillis()
        editor.putString("pokemon_$timestamp", name.uppercase())
        editor.apply()
    }

    fun getAllPokemonNames(): List<String> {
        val allEntries = sharedPreferences.all
        return allEntries.entries.sortedByDescending { it.key }
            .mapNotNull { it.value as? String }
    }

}
