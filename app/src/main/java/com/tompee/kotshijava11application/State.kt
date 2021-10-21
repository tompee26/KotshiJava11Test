package com.tompee.kotshijava11application

import com.squareup.moshi.Json
import se.ansman.kotshi.JsonSerializable

@JsonSerializable
internal data class State(
    @field:Json(name = "required") val required: Boolean,
    @field:Json(name = "optional") val optional: Boolean
)