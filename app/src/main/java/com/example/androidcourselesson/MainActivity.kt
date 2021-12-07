package com.example.androidcourselesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Вывод каждой чётной буквы английского алфавита:")

        val abc = 'a'.rangeTo('z').toList()

        for (char in 1 until abc.size step 2) {
            println(abc[char])
        }
    }
}