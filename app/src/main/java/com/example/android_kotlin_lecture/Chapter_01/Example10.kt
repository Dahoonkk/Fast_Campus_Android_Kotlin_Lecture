package com.example.android_kotlin_lecture.Chapter_01

// 10. String Templates

fun main() {
    val a = 10
    val name = "hello nice to meet you"
    val isHigh = true

    println(a.toString() + name + isHigh.toString()) // 자바의 방식

    // 코틀린의 String Templates
    println("$a ${name.length} $isHigh") // $를 활용하여 간단하게 형식을 지정해서 출력할 수 있음
}