package br.com.digitalhouse.apiqueens.repository

import br.com.digitalhouse.apiqueens.model.Queens
import br.com.digitalhouse.apiqueens.network.EndPointApi
import br.com.digitalhouse.apiqueens.network.RetrofitInit

class QueensRepository {

    private val url = "https://www.nokeynoshade.party/api/"
    private var service = EndPointApi::class

    private val serviceQueen = RetrofitInit(url).create(service)
    suspend fun getAllQueensService() : Queens = serviceQueen.getResponseAllQueens()
}