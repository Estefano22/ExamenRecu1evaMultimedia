package com.example.recu1evamultimedia

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {

    companion object {
        const val PARAM1 = "_____ "
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val textView = findViewById<TextView>(R.id.textView2)

        val text = intent.getStringExtra(PARAM1)

        text?.let {
            textView.text = it.replace("_____ ", "\n")
        }


    }

    }

