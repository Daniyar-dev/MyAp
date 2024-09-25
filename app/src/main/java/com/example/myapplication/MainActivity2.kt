package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val builder = AlertDialog.Builder(this)
        builder.setTitle("Выход")
        builder.setMessage("Вы уверены что хотите выйти?")
        builder.setPositiveButton("Да") { dialog, a ->
            Log.d("CLick","Yes")
        }
        builder.setNegativeButton("Нет") { dialog, a ->
            Log.d("CLick","No")
        }
        val dialog = builder.create()
        dialog.show()
    }
}