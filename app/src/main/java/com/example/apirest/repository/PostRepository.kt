package com.example.apirest.repository

import com.example.apirest.data.model.Post
import com.example.apirest.data.remote.RetrofitInstance

class PostRepository {
    private val api = RetrofitInstance.api

    suspend fun getPosts(): List<Post> {
        return api.getPosts()
    }
}