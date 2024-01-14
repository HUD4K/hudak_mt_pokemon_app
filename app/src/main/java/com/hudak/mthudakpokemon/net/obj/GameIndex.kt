package com.hudak.mthudakpokemon.net.obj

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class GameIndex {
    @SerializedName("game_index")
    @Expose
    var gameIndex: Int? = null

    @SerializedName("version")
    @Expose
    var version: Version? = null
}