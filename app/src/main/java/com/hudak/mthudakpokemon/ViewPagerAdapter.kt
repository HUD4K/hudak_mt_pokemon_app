package com.hudak.mthudakpokemon

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.hudak.mthudakpokemon.view.PokemonHistoryFragment
import com.hudak.mthudakpokemon.view.PokemonSearchFragment


class ViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> PokemonSearchFragment()
            else -> PokemonHistoryFragment()
        }
    }

    override fun getItemCount(): Int = 2
}