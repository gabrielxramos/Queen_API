package br.com.digitalhouse.apiqueens.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.digitalhouse.apiqueens.R
import br.com.digitalhouse.apiqueens.model.QueensItem
import br.com.digitalhouse.apiqueens.view.adapter.QueensAdapter
import br.com.digitalhouse.apiqueens.viewmodel.QueensViewModel

class MainActivity : AppCompatActivity() {

    private var queens = mutableListOf<QueensItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler = findViewById<RecyclerView>(R.id.recycler_main)
        val viewModelQueens = ViewModelProviders.of(this).get(QueensViewModel::class.java)
        val adapterQueens = QueensAdapter(queens, this)

        recycler.adapter = adapterQueens

//        val layoutManager = GridLayoutManager(this, 2)
//
//        recycler.layoutManager = layoutManager

        viewModelQueens.getAllQueens()
        viewModelQueens.mutableListQueen.observe(this, Observer {
            it.let { itQueen -> queens.addAll(itQueen)}
            adapterQueens.notifyDataSetChanged()
        })
    }
}