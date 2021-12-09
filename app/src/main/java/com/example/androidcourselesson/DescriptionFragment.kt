package com.example.androidcourselesson

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DescriptionFragment : Fragment() {

    lateinit var participantsRecyclerView: RecyclerView
    lateinit var showWikipediaButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_description, container, false)

        val participantsNames: List<String> = listOf(
            "Валет червей — адъютант Николай Александрович Волков",
            "Валет бубен — великий князь Андрей Владимирович",
            "Валет треф — великий князь Михаил Александрович",
            "Валет пик — штабс-ротмистр Александр Николаевич Безак",
            "Дама червей — великая княгиня Ксения Александровна",
            "Дама бубен — графиня Александра Дмитриевна Толстая",
            "Дама треф — великая княгиня Елизавета Фёдоровна",
            "Дама пик — княгиня Зинаида Николаевна Юсупова",
            "Король червей — император Николай II",
            "Король бубен — шталмейстер Высочайшего двора Николай Николаевич Гартунг",
            "Король треф — граф Михаил Николаевич Граббе",
            "Король пик — прототипа нет"
        )

        showWikipediaButton = view.findViewById(R.id.show_wikipedia_button)
        participantsRecyclerView = view.findViewById(R.id.participants_recycler_view)
        participantsRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        participantsRecyclerView.adapter = ParticipantAdapter(participantsNames)
        participantsRecyclerView.addItemDecoration(
            DividerItemDecoration(
                context,
                DividerItemDecoration.VERTICAL
            )
        )

        showWikipediaButton.setOnClickListener {
            val link = Uri.parse("https://ru.wikipedia.org/wiki/Колода_«Русский_стиль»")
            val intent = Intent(Intent.ACTION_VIEW, link)
            context?.startActivity(intent)
        }
        return view
    }

}