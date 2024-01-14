package com.hudak.mthudakpokemon.net.obj

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class GenerationV {
    @SerializedName("black-white")
    @Expose
    var blackWhite: BlackWhite? = null
}