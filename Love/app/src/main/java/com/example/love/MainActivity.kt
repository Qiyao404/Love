package com.example.love

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.google.firebase.messaging.FirebaseMessaging
import android.widget.Toast



class MainActivity : AppCompatActivity() {

    @SuppressLint("QueryPermissionsNeeded")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val backgroundImageView = findViewById<ImageView>(R.id.backgroundImageView)

        backgroundImageView.setImageResource(R.drawable.background)


        val callButton: Button = findViewById(R.id.callButton)
        callButton.setOnClickListener {
            val phoneNumber = "13318303108"
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:$phoneNumber")
            startActivity(intent)
        }

//        val intent = Intent(this, YouTubePlayerActivity::class.java)
//        startActivity(intent)


        val messageButton: Button = findViewById(R.id.messageButton)
        messageButton.setOnClickListener {
            val phoneNumber = "1234567890"
            val message = "Hello, I love you!"
        val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("smsto:$phoneNumber")
            intent.putExtra("sms_body", message)


            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            } else {
                Toast.makeText(this, "Sorry, no SMS apps available", Toast.LENGTH_SHORT).show()
            }
        }

        FirebaseMessaging.getInstance().subscribeToTopic("love_messages")
    }

    fun goToMessageActivity(view: View) {
        val intent = Intent(this, Message::class.java)
        startActivity(intent)
    }
    fun showQuote(view: View) {
        val quoteText = "Your apple pies are the best"
        val intent = Intent(this, QuoteActivity::class.java)
        intent.putExtra("quote_text", quoteText)
        startActivity(intent)
    }

}



