package com.example.lesson_3_myazin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        findViewById<TextView>(R.id.textViewTitle2).setText("Карта №7898769\nСпециалист")
        findViewById<EditText>(R.id.nameEditText2).setText("Анастасия")
        findViewById<EditText>(R.id.surnameEditText2).setText("Антонина")
        findViewById<EditText>(R.id.emailEditText2).setText("anykee.box@gmail.ru")
        findViewById<EditText>(R.id.loginEditText2).setText("HIE023UOI88")
        findViewById<EditText>(R.id.regionEditText2).setText("Санкт-Петербург")

        val exitButton = findViewById<ImageView>(R.id.exitButton2)
        val editButton1 = findViewById<ImageView>(R.id.editButton12)
        val editButton2 = findViewById<ImageView>(R.id.editButton22)

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