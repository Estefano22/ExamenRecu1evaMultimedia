package com.example.recu1evamultimedia

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {

    companion object {
        const val PARAM1 = "__ "
        const val PARAM2 = "__ "
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val textView = findViewById<TextView>(R.id.textView2)

        val text1 = intent.getStringExtra(PARAM1)
        val text2 = intent.getStringExtra(PARAM2)

        text1?.let {
            textView.text = it.replace("__ ", "\n")
        }

        text2?.let {
            textView.text = it.replace("__ ", "\n")
        }

    }

    }

