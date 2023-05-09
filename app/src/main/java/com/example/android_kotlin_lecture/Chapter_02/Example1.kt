package com.example.android_kotlin_lecture.Chapter_02

// 1. 람다 -> 함수형 프로그래밍에서 대표적

fun main() {
    // 람다식 : 익명함수
    // 변수처럼 사용되서, 어떤 함수의 argument가 될 수도 있으며 return 값이 될 수도 있음
    // 한 번 사용되고, 재사용되지 않는 함수
    // 람다식의 맨 마지막 줄은 return 값
    val a = fun() { println("hello") }
    val c : Int = 10
    val b : (Int) -> Int = { it * 10}
    val d = {i : Int, j : Int -> i * j}
    val f : (Int, String, Boolean) -> String = {_, b, _ -> b }

    println(b(10))
    println(d(2,3))
    println(f(1, "hello", true))

    hello(10, b)
}

fun hello(a: Int, b:(Int) -> Int) {
    println(a)
    println(b(20))
}

