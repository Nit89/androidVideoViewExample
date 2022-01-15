package com.example.videoplayer

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    var  currvideo  = 0
    var vw:VideoView ? = null
    private var videoList = ArrayList<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         vw = findViewById(R.id.vidVw)
         vw!!.setMediaController(MediaController(this))
         vw!!.setOnCompletionListener(MediaPlayer.OnCompletionListener {  })


        videoList.add(R.raw.got)
       videoList.add(R.raw.bollywood)
        videoList.add(R.raw.startup)

        setVideo(videoList[0])






    }

    private fun setVideo(get: Int) {
       val uriPath :String = "android.resource://"+ getPackageName() + "/" + get
        val uri = Uri.parse(uriPath)
        vw?.setVideoURI(uri)
        vw?.start()

    }

}