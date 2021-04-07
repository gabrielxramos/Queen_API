package br.com.digitalhouse.apiqueens.network

import br.com.digitalhouse.apiqueens.model.Queens
import retrofit2.http.GET

interface EndPointApi {

    @GET("queens/all")
    suspend fun getResponseAllQueens(): Queens

}