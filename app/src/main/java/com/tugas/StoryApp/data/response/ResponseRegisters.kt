package com.tugas.StoryApp.data.response

import com.google.gson.annotations.SerializedName

data class ResponseRegisters (
    @field:SerializedName("error")
    val error: Boolean? = null,

    @field:SerializedName("message")
    val message: String? = null
)