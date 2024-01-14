package com.hudak.mthudakpokemon.net.obj

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class OfficialArtwork {
    @SerializedName("front_default")
    @Expose
    var frontDefault: String? = null

    @SerializedName("front_shiny")
    @Expose
    var frontShiny: String? = null
}