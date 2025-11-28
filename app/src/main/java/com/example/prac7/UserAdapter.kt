package com.example.prac7

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.prac7.R

class UserAdapter(private val userList: List<User>) : RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val userNameTextView: TextView = view.findViewById(R.id.userNameTextView)
        val userAvatarImageView: ImageView = view.findViewById(R.id.userAvatarImageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_user, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user = userList[position]
        holder.userNameTextView.text = user.name
        // Устанавливаем правильную картинку для каждого пользователя
        holder.userAvatarImageView.setImageResource(user.imageRes)

        // Делаем аватарку круглой (если у вас есть CardView в list_item_user,
        // но можно и программно обрезать, но лучше просто использовать круглые картинки или CardView в XML)
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}