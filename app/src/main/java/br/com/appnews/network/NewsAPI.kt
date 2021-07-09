package br.com.appnews.network

import retrofit2.http.GET

interface NewsAPI {

    @GET
    suspend fun getBreakingNews(

    )
}