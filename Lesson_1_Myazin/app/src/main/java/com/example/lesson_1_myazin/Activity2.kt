package com.example.lesson_1_myazin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.Random

class Activity2 : AppCompatActivity() {
    var peopleInfoHashMap = HashMap<Int, Student?>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val editText = findViewById<EditText>(R.id.editText)
        editText.setOnKeyListener {_, keyCode, keyEvent ->
            if (keyEvent.action == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                var personInfo = editText.text.split(' ')
                var student: Student? = null
                try {
                    student = Student(personInfo[0], personInfo[1], personInfo[2], personInfo[3])
                }
                catch (ex: Exception){
                    Toast.makeText(this, ex.toString(), Toast.LENGTH_LONG).show()
                    return@setOnKeyListener true
                }
                var id = Random(System.currentTimeMillis()).nextInt()
                peopleInfoHashMap.put(id, student)
                editText.text.clear()

                return@setOnKeyListener true
            }
            false
        }

        findViewById<Button>(R.id.buttonShowPeopleInfo).setOnClickListener {
            var allPeopleInfoString = ""
            for(personInfo in peopleInfoHashMap)
                allPeopleInfoString += "${personInfo.key} ${personInfo.value.toString()} \n"
            findViewById<TextView>(R.id.textView).setText(allPeopleInfoString)
        }
    }
}