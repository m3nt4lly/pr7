package com.example.prac7

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.prac7.R

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val registerButton: Button = findViewById(R.id.registerButton)
        val termsCheckbox: CheckBox = findViewById(R.id.termsCheckbox)

        registerButton.isEnabled = false

        termsCheckbox.setOnCheckedChangeListener { _, isChecked ->
            registerButton.isEnabled = isChecked
        }

        registerButton.setOnClickListener {
            // Получаем текст из поля ввода имени
            val firstName = findViewById<EditText>(R.id.firstNameEditText).text.toString()

            val intent = Intent(this, MainActivity::class.java)
            // "Кладём" имя в рюкзак (Intent), чтобы передать его дальше
            intent.putExtra("USER_NAME", firstName)
            startActivity(intent)
        }
    }
}