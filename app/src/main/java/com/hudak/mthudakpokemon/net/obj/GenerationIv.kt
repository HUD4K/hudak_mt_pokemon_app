package com.hudak.mthudakpokemon.net.obj

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class GenerationIv {
    @SerializedName("diamond-pearl")
    @Expose
    var diamondPearl: DiamondPearl? = null

    @SerializedName("heartgold-soulsilver")
    @Expose
    var heartgoldSoulsilver: HeartgoldSoulsilver? = null

    @SerializedName("platinum")
    @Expose
    var platinum: Platinum? = null
}