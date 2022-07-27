package com.saehyun.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btn : Button = findViewById(R.id.btn)

        btn.setOnClickListener {
            Toast.makeText(applicationContext, "fix", Toast.LENGTH_SHORT).show()
        }
    }
}