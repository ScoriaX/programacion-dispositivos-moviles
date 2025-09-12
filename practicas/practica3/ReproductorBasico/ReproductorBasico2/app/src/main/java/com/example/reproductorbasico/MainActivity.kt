package com.example.reproductorbasico

import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var mp: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun play(view: View) {
        if (mp == null) {
            mp = MediaPlayer.create(this, R.raw.musica)
        }
        mp?.start()
        Toast.makeText(this, "Play", Toast.LENGTH_SHORT).show()
    }

    fun pause(view: View) {
        mp?.pause()
        Toast.makeText(this, "Pause", Toast.LENGTH_SHORT).show()
    }

    fun stop(view: View) {
        mp?.stop()
        mp?.release()
        mp = null
        Toast.makeText(this, "Stop", Toast.LENGTH_SHORT).show()
    }
}
