package com.example.androidcourselesson

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ParticipantAdapter(private val participantsNames: List<String>) :
    RecyclerView.Adapter<ParticipantViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParticipantViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.participant_list_item, parent, false)
        return ParticipantViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ParticipantViewHolder, position: Int) {
        val name=participantsNames[position]
        holder.bind(name)
    }

    override fun getItemCount(): Int {
        return participantsNames.size
    }
}