package com.hudak.mthudakpokemon.net.obj

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class Type {
    @SerializedName("slot")
    @Expose
    var slot: Int? = null

    @SerializedName("type")
    @Expose
    var type: Type__1? = null
}