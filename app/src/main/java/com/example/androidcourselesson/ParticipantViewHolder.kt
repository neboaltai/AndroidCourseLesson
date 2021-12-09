package com.example.androidcourselesson

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ParticipantViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val participantNameTextView: TextView =
        itemView.findViewById(R.id.participant_name_text_view)

    fun bind(name:String){
        participantNameTextView.text = name
    }
}