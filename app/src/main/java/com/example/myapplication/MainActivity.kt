package com.example.myapplication

import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.textView)
        val editText = findViewById<EditText>(R.id.editText)
        val button = findViewById<Button>(R.id.btn)
        val login = intent.getStringExtra("Login")
        button.setOnClickListener {
            val result = editText.text.toString()
            when(result) {
                "1" -> textView.setTextColor(getColor(R.color.black))
                "2" -> textView.setTextColor(getColor(R.color.black))
                "3" -> textView.setTextColor(getColor(R.color.black))
                "4" -> textView.setTextColor(getColor(R.color.black))
                "5" -> textView.setTextColor(getColor(R.color.black))
                "6" -> textView.setTextColor(getColor(R.color.black))
                else -> textView.setTextColor(getColor(R.color.black))
            }
        }
    }
}


