package com.hudak.mthudakpokemon.net.obj

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class VersionDetail {
    @SerializedName("rarity")
    @Expose
    var rarity: Int? = null

    @SerializedName("version")
    @Expose
    var version: Version__1? = null
}