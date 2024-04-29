package com.example.musicstreamer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.media3.exoplayer.ExoPlayer
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.musicstreamer.databinding.ActivityMainBinding
import com.example.musicstreamer.databinding.ActivityPlayer2Binding

class PlayerActivity : AppCompatActivity() {
    lateinit var binding: ActivityPlayer2Binding
    lateinit var exoPlayer: ExoPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlayer2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        MyExoplayer.getCurrentSong()?.apply {
            binding.songTitleTextView.text = title
            binding.songSubtitleTextView.text = subtitle
            Glide.with(binding.songCoverImageView).load(coverUrl)
                .circleCrop()
                .into(binding.songCoverImageView)
            exoPlayer = MyExoplayer.getInstance()!!
            binding.playerView.player=exoPlayer
            binding.playerView.showController()

        }
    }
}