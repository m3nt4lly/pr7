package com.example.prac7

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. ПОЛУЧАЕМ ИМЯ
        val userName = intent.getStringExtra("USER_NAME") ?: "Пользователь"

        // 2. НАХОДИМ TEXTVIEW И СТАВИМ ТЕКСТ
        val welcomeTextView: TextView = findViewById(R.id.welcomeTextView)
        // Формируем строку: "Иван, приветствуем..."
        welcomeTextView.text = "$userName,\nприветствуем в нашем приложении"

        // Логика кнопок
        val clickButton: Button = findViewById(R.id.clickButton1)
        clickButton.setOnClickListener {
            val intent = Intent(this, UserListActivity::class.java)
            startActivity(intent)
        }
    }
}