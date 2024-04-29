package com.example.musicstreamer.models

data class CategoryModel(
    val name: String,
    val coverUrl: String,
    val songs: List<String>
) {
    constructor() : this(name = "", coverUrl = "", songs = emptyList())
}
