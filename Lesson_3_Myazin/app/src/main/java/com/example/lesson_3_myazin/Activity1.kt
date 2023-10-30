package com.example.lesson_3_myazin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.LayoutInflater.*
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class Activity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)


        findViewById<TextView>(R.id.textViewTitle).setText("Карта №7898769\nСпециалист")
        findViewById<EditText>(R.id.nameEditText).setText("Анастасия")
        findViewById<EditText>(R.id.surnameEditText).setText("Антонина")
        findViewById<EditText>(R.id.emailEditText).setText("anykee.box@gmail.ru")
        findViewById<EditText>(R.id.loginEditText).setText("HIE023UOI88")
        findViewById<EditText>(R.id.regionEditText).setText("Санкт-Петербург")

        val exitButton = findViewById<ImageView>(R.id.exitButton)
        val editButton1 = findViewById<ImageView>(R.id.editButton1)
        val editButton2 = findViewById<ImageView>(R.id.editButton2)

        exitButton.setOnClickListener {
            Toast.makeText(this, "Выход из аккаунта", Toast.LENGTH_SHORT).show()
        }
        editButton1.setOnClickListener {
            Toast.makeText(this, "Редактирование 1", Toast.LENGTH_SHORT).show()
        }
        editButton2.setOnClickListener {
            Toast.makeText(this, "Редактирование 2", Toast.LENGTH_SHORT).show()
        }
    }
}