package com.hudak.mthudakpokemon.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.hudak.mthudakpokemon.R
import com.hudak.mthudakpokemon.SharedPreferencesRepository

class PokemonHistoryFragment : Fragment() {
    private lateinit var nameList: TextView
    private lateinit var sharedPreferencesRepository: SharedPreferencesRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedPreferencesRepository = SharedPreferencesRepository(requireContext())
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_page2, container, false)
        nameList = view.findViewById(R.id.historylist)

        loadSavedPokemons()

        return view
    }

    override fun onResume() {
        super.onResume()
        loadSavedPokemons()
    }

    private fun loadSavedPokemons() {
        val pokemonNames = sharedPreferencesRepository.getAllPokemonNames()
        nameList.text = pokemonNames.joinToString("\n")
    }
}
