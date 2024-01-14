package com.hudak.mthudakpokemon.net.obj

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class GenerationIii {
    @SerializedName("emerald")
    @Expose
    var emerald: Emerald? = null

    @SerializedName("firered-leafgreen")
    @Expose
    var fireredLeafgreen: FireredLeafgreen? = null

    @SerializedName("ruby-sapphire")
    @Expose
    var rubySapphire: RubySapphire? = null
}