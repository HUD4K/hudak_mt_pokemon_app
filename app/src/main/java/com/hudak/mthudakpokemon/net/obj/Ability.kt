package com.hudak.mthudakpokemon.net.obj

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class Ability {
    @SerializedName("ability")
    @Expose
    var ability: Ability__1? = null

    @SerializedName("is_hidden")
    @Expose
    var isHidden: Boolean? = null

    @SerializedName("slot")
    @Expose
    var slot: Int? = null
}