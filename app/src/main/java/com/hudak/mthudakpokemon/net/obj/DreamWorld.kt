package com.hudak.mthudakpokemon.net.obj

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class DreamWorld {
    @SerializedName("front_default")
    @Expose
    var frontDefault: String? = null

    @SerializedName("front_female")
    @Expose
    var frontFemale: Any? = null
}