package br.com.digitalhouse.apiqueens.model

import com.google.gson.annotations.SerializedName

data class QueensItem(
    val id: Int,
    @SerializedName("image_url")
    val imageUrl: String,
    val missCongeniality: Boolean,
    val name: String,
    val quote: String,
    val winner: Boolean
)