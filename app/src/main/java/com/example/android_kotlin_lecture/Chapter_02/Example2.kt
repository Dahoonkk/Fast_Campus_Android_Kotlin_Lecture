package com.example.android_kotlin_lecture.Chapter_02

// 2.확장함수

fun main() {
    // 확장함수 : Extension Function
    // 기존에 정의되어 있는 클래스에 함수를 추가하는 기능
    val test = Test()
    Test().hello()
    Test().hi()
}

fun Test.hi() = print("hi")  // 확장함수

class Test() {
    fun hello() = println("안녕")
    fun bye() = println("잘가")
}