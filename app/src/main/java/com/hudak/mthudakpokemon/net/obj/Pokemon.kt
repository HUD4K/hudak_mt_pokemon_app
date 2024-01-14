package com.hudak.mthudakpokemon.net.obj

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class Pokemon {
    @SerializedName("abilities")
    @Expose
    var abilities: List<Ability>? = null

    @SerializedName("base_experience")
    @Expose
    var baseExperience: Int? = null

    @SerializedName("forms")
    @Expose
    var forms: List<Form>? = null

    @SerializedName("game_indices")
    @Expose
    var gameIndices: List<GameIndex>? = null

    @SerializedName("height")
    @Expose
    var height: Int? = null

    @SerializedName("held_items")
    @Expose
    var heldItems: List<HeldItem>? = null

    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("is_default")
    @Expose
    var isDefault: Boolean? = null

    @SerializedName("location_area_encounters")
    @Expose
    var locationAreaEncounters: String? = null

    @SerializedName("moves")
    @Expose
    var moves: List<Move>? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("order")
    @Expose
    var order: Int? = null

    @SerializedName("past_types")
    @Expose
    var pastTypes: List<Any>? = null

    @SerializedName("species")
    @Expose
    var species: Species? = null

    @SerializedName("sprites")
    @Expose
    var sprites: Sprites? = null

    @SerializedName("stats")
    @Expose
    var stats: List<Stat>? = null

    @SerializedName("types")
    @Expose
    var types: List<Type>? = null

    @SerializedName("weight")
    @Expose
    var weight: Int? = null
}