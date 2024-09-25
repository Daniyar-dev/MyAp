package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityDataBinding
import com.example.myapplication.databinding.ActivityStringBinding

class EnterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStringBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStringBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.enterBtn.setOnClickListener {
            val login = binding.etLogin.text.toString()
            val password = binding.etPassword.text.toString()
            val user = User()
            if (login == user.login && password == user.password) {
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("Login", login)
                startActivity(intent)
            } else {
                binding.error.visibility = View.VISIBLE
            }
        }

    }
}

class User(){
    val login = "Alex123"
    val password = "123456a"
}