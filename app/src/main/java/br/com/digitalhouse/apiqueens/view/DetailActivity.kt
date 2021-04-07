package br.com.digitalhouse.apiqueens.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import br.com.digitalhouse.apiqueens.R
import com.squareup.picasso.Picasso

class DetailActivity : AppCompatActivity() {

    val name: TextView by lazy { findViewById(R.id.txt_name_participant_details) }
    val img: ImageView by lazy { findViewById(R.id.img_participant_details) }
    val quote: TextView by lazy { findViewById(R.id.txt_quotes_participant_details) }
    val winner: TextView by lazy { findViewById(R.id.txt_participant_winner_details) }
    val missCongeniality: TextView by lazy { findViewById(R.id.txt_participant_miss_congeniality) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        initDetails()
    }

    fun initDetails() {
        val detail = intent.extras

        if (detail != null) {

            val participantName = detail.getString("PARTICIPANT_NAME", "Don't have a Name")
            val participantImg = detail.getString("PARTICIPANT_IMG", "Don't have a Photo")
            val participantQuote = detail.getString("PARTICIPANT_QUOTE", "Don't have a Quote")
            val participantWinner = detail.getBoolean("PARTICIPANT_WINNER")
            val participantMissCongeniality = detail.getBoolean("PARTICIPANT_MISS")

            name.text = participantName
            Picasso.get().load(participantImg).into(img)
            quote.text = participantQuote

            if (participantWinner) {
                winner.visibility = View.VISIBLE
            } else {
                winner.visibility = View.GONE
            }
            if (participantMissCongeniality) {
                missCongeniality.visibility = View.VISIBLE
            } else {
                missCongeniality.visibility = View.GONE
            }
        }
    }

}