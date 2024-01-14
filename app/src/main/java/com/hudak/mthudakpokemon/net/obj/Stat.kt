package com.hudak.mthudakpokemon.net.obj

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class Stat {
    @SerializedName("base_stat")
    @Expose
    var baseStat: Int? = null

    @SerializedName("effort")
    @Expose
    var effort: Int? = null

    @SerializedName("stat")
    @Expose
    var stat: Stat__1? = null
}