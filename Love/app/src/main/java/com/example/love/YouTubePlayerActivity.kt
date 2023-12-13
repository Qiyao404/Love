package com.example.love

//import android.os.Bundle
//import androidx.appcompat.app.AppCompatActivity
//import com.google.android.youtube.player.YouTubeBaseActivity
//import com.google.android.youtube.player.YouTubeInitializationResult
//import com.google.android.youtube.player.YouTubePlayer
//import com.google.android.youtube.player.YouTubePlayerView
//
//class YouTubePlayerActivity : YouTubeBaseActivity() {
//
//    private lateinit var youtubePlayerView: YouTubePlayerView
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_youtube_player)
//
//        youtubePlayerView = findViewById(R.id.youtubePlayerView)
//
//
//        youtubePlayerView.initialize("AIzaSyDVi71YFRabZeHAIIEYWoJ_Hwx6MgtDIOE", object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(
//                provider: YouTubePlayer.Provider?,
//                player: YouTubePlayer?,
//                wasRestored: Boolean
//            ) {
//                if (!wasRestored) {
//                    player?.loadVideo("VIDEO_ID")
//                }
//            }
//
//            override fun onInitializationFailure(
//                provider: YouTubePlayer.Provider?,
//                result: YouTubeInitializationResult?
//            ) {
//
//            }
//        })
//    }
//}
