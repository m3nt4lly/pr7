package com.example.prac7

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.prac7.R

class UserListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_list)

        val userRecyclerView: RecyclerView = findViewById(R.id.userRecyclerView)

        // Заполняем список реальными данными с картинками
        // Убедитесь, что файлы с такими именами есть в res/drawable!
        val userList = listOf(
            User("Robert Fox", R.drawable.user_robert),
            User("Albert Flores", R.drawable.user_albert),
            User("Kathryn Murphy", R.drawable.user_kathryn),
            User("Courtney Henry", R.drawable.user_courtney),
            User("Eleanor Pena", R.drawable.user_eleanor),
            User("Marvin McKinney", R.drawable.user_marvin),
            User("Darlene Robertson", R.drawable.user_darlene),
            User("Bessie Cooper", R.drawable.user_bessie)
        )

        userRecyclerView.layoutManager = LinearLayoutManager(this)
        userRecyclerView.adapter = UserAdapter(userList)
    }
}