package com.hudak.mthudakpokemon.net.obj

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class Gold {
    @SerializedName("back_default")
    @Expose
    var backDefault: String? = null

    @SerializedName("back_shiny")
    @Expose
    var backShiny: String? = null

    @SerializedName("front_default")
    @Expose
    var frontDefault: String? = null

    @SerializedName("front_shiny")
    @Expose
    var frontShiny: String? = null

    @SerializedName("front_transparent")
    @Expose
    var frontTransparent: String? = null
}