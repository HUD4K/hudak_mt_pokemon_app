package com.hudak.mthudakpokemon.net.obj

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class HeldItem {
    @SerializedName("item")
    @Expose
    var item: Item? = null

    @SerializedName("version_details")
    @Expose
    var versionDetails: List<VersionDetail>? = null
}