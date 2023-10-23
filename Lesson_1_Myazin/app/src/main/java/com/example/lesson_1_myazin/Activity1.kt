package com.example.lesson_1_myazin

import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.TreeSet

class Activity1 : AppCompatActivity() {
    var namesTreeSet = TreeSet<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)

        var editText = findViewById<EditText>(R.id.editText)
        findViewById<Button>(R.id.buttonAddPeopleToList).setOnClickListener {
            for (name in editText.text.split('\n'))
                namesTreeSet.add(name)
            editText.text.clear()
        }

        findViewById<Button>(R.id.buttonShowSortedListWithPeople).setOnClickListener {
            var allNamesString = ""
            namesTreeSet.sorted()
            for(name in namesTreeSet)
                if(name != null)
                    allNamesString += "$name\n"
            findViewById<TextView>(R.id.textView).setText(allNamesString)
        }
    }
}