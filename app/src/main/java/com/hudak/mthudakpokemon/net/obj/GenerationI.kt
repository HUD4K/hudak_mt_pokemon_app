package com.hudak.mthudakpokemon.net.obj

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class GenerationI {
    @SerializedName("red-blue")
    @Expose
    var redBlue: RedBlue? = null

    @SerializedName("yellow")
    @Expose
    var yellow: Yellow? = null
}