package com.example.lesson_2_myazin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.buttonGoToAct1).setOnClickListener {
            val intent = Intent(this, Activity1::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.buttonGoToAct2).setOnClickListener {
            val intent = Intent(this, Activity2::class.java)
            startActivity(intent)
        }
    }
}