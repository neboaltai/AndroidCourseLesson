package com.example.androidcourselesson

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

private const val LAST_ROLLED_IMAGE = "image"

class CardDrawFragment : Fragment() {

    lateinit var cardImageView: ImageView
    lateinit var drawButton: Button

    private val cardImageList : List<Int> = listOf(
        R.drawable.jack_clubs,
        R.drawable.jack_diamonds,
        R.drawable.jack_hearts,
        R.drawable.jack_spades,
        R.drawable.king_clubs,
        R.drawable.king_diamonds,
        R.drawable.king_hearts,
        R.drawable.king_spades,
        R.drawable.queen_clubs,
        R.drawable.queen_diamonds,
        R.drawable.queen_hearts,
        R.drawable.queen_spades
    )

    var lastDrawnImageRes=0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_card_drawl, container, false)

        cardImageView = view.findViewById(R.id.card_image_view)
        drawButton = view.findViewById(R.id.draw_button)

        if(savedInstanceState!=null)
            cardImageView.setImageResource(savedInstanceState.getInt(LAST_ROLLED_IMAGE))

        drawButton.setOnClickListener {
            lastDrawnImageRes=cardImageList.random()
            cardImageView.setImageResource(lastDrawnImageRes)
        }
        return view
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(LAST_ROLLED_IMAGE, lastDrawnImageRes)
    }
}