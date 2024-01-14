package com.hudak.mthudakpokemon.net.obj

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class Move {
    @SerializedName("move")
    @Expose
    var move: Move__1? = null

    @SerializedName("version_group_details")
    @Expose
    var versionGroupDetails: List<VersionGroupDetail>? = null
}