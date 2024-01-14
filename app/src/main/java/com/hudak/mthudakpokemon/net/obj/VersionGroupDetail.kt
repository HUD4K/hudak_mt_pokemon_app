package com.hudak.mthudakpokemon.net.obj

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class VersionGroupDetail {
    @SerializedName("level_learned_at")
    @Expose
    var levelLearnedAt: Int? = null

    @SerializedName("move_learn_method")
    @Expose
    var moveLearnMethod: MoveLearnMethod? = null

    @SerializedName("version_group")
    @Expose
    var versionGroup: VersionGroup? = null
}