package com.example.android_kotlin_lecture.Chapter_01

fun main() {
    val user = User("dahoon")
    println(user.age)

}

class User(val name : String, var age : Int = 26)