package br.com.digitalhouse.apiqueens.view.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import br.com.digitalhouse.apiqueens.R

class ViewHolderQueens(view: View) : RecyclerView.ViewHolder(view) {

    val cardview = view.findViewById<CardView>(R.id.cardview_participant)
    val image = view.findViewById<ImageView>(R.id.img_participant_card)
    val name = view.findViewById<TextView>(R.id.txt_card)

}