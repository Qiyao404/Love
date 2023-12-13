package com.example.love

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class QuoteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quote_layout)

        val applePiesTextView = findViewById<TextView>(R.id.applePiesTextView)
        val wiseManQuoteTextView = findViewById<TextView>(R.id.wiseManQuoteTextView)

        val applePiesText = getString(R.string.your_apple_pies_are_the_best)
        val wiseManQuoteText = getString(R.string.wise_man_quote)

        applePiesTextView.text = applePiesText
        wiseManQuoteTextView.text = wiseManQuoteText
    }
}
