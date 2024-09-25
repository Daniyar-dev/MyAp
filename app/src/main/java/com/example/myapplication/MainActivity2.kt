package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val builder = AlertDialog.Builder(this)
        builder.setTitle("Выход")
        builder.setMessage("Вы уверены что хотите выйти?")
        builder.setPositiveButton("Да") { dialog, a ->

        }
        builder.setNegativeButton("Нет") { dialog, a ->

        }
        val dialog = builder.create()
        dialog.show()
    }
}