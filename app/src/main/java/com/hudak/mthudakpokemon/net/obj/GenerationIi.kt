package com.hudak.mthudakpokemon.net.obj

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class GenerationIi {
    @SerializedName("crystal")
    @Expose
    var crystal: Crystal? = null

    @SerializedName("gold")
    @Expose
    var gold: Gold? = null

    @SerializedName("silver")
    @Expose
    var silver: Silver? = null
}