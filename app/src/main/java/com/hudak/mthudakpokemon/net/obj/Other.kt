package com.hudak.mthudakpokemon.net.obj

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class Other {
    @SerializedName("dream_world")
    @Expose
    var dreamWorld: DreamWorld? = null

    @SerializedName("home")
    @Expose
    var home: Home? = null

    @SerializedName("official-artwork")
    @Expose
    var officialArtwork: OfficialArtwork? = null
}