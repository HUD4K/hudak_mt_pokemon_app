package com.hudak.mthudakpokemon.net.obj

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class GenerationVi {
    @SerializedName("omegaruby-alphasapphire")
    @Expose
    var omegarubyAlphasapphire: OmegarubyAlphasapphire? = null

    @SerializedName("x-y")
    @Expose
    private var xY: XY? = null
    fun getxY(): XY? {
        return xY
    }

    fun setxY(xY: XY?) {
        this.xY = xY
    }
}