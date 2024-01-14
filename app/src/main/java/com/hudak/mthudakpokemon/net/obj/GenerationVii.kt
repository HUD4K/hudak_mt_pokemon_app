package com.hudak.mthudakpokemon.net.obj

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class GenerationVii {
    @SerializedName("icons")
    @Expose
    var icons: Icons? = null

    @SerializedName("ultra-sun-ultra-moon")
    @Expose
    var ultraSunUltraMoon: UltraSunUltraMoon? = null
}