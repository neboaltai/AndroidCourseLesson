package com.example.androidcourselesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "Ты видел деву на скале")
        Log.d(TAG, "В одежде белой над волнами")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Когда, бушуя в бурной мгле,")
        Log.d(TAG, "Играло море с берегами,")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Когда луч молний озарял")
        Log.d(TAG, "Ее всечасно блеском алым")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "И ветер бился и летал")
        Log.d(TAG, "С ее летучим покрывалом?")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Прекрасно море в бурной мгле")
        Log.d(TAG, "И небо в блесках без лазури;")
    }

    override fun onRestart() {
        super.onRestart()

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Но верь мне: дева на скале")
        Log.d(TAG, "Прекрасней волн, небес и бури.")
    }
}