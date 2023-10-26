package com.example.lesson_1_myazin

import java.util.Random

class Student(val name: String, val surname: String, val grade: String, val birthdayYear: String) {
    override fun toString(): String
    {
        return "$name $surname $grade $birthdayYear"
    }
}