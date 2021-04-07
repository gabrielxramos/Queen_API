package br.com.digitalhouse.apiqueens.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.digitalhouse.apiqueens.model.QueensItem
import br.com.digitalhouse.apiqueens.repository.QueensRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class QueensViewModel: ViewModel() {

    val mutableListQueen = MutableLiveData<List<QueensItem>>()
    private val repository = QueensRepository()

    fun getAllQueens() = CoroutineScope(Dispatchers.IO).launch {
        repository.getAllQueensService().let {queensResponse ->
            mutableListQueen.postValue(queensResponse)
        }
    }

}