package com.example.apirest.repository

import com.example.apirest.data.model.Post
import com.example.apirest.data.remote.RetrofitInstance
import retrofit2.Response

class PostRepository {
    private val api = RetrofitInstance.api

    suspend fun getPosts(): List<Post> {
        return api.getPosts()
    }

    suspend fun getPost(id: Int): Post {
        return api.getPost(id)
    }

    suspend fun createPost(post: Post): Post {
        return api.createPost(post)
    }

    suspend fun updatePost(id: Int, post: Post): Post {
        return api.updatePost(id, post)
    }

    suspend fun deletePost(id: Int): Response<Unit> {
        return api.deletePost(id)
    }
}