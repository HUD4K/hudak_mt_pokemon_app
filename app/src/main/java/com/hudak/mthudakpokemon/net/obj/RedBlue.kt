package com.hudak.mthudakpokemon.net.obj

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class RedBlue {
    @SerializedName("back_default")
    @Expose
    var backDefault: String? = null

    @SerializedName("back_gray")
    @Expose
    var backGray: String? = null

    @SerializedName("back_transparent")
    @Expose
    var backTransparent: String? = null

    @SerializedName("front_default")
    @Expose
    var frontDefault: String? = null

    @SerializedName("front_gray")
    @Expose
    var frontGray: String? = null

    @SerializedName("front_transparent")
    @Expose
    var frontTransparent: String? = null
}