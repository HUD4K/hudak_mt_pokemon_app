package com.hudak.mthudakpokemon.net.obj

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class Version {
    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("url")
    @Expose
    var url: String? = null
}