package com.example.android_kotlin_lecture.Chapter_01

// 6. 반복문
fun main() {
    /*
        자바의 반복문
        for(int i=1; i<11; i++) { }
     */

    // Kotlin의 반복문
    for(i in 1 .. 10) { // 1..10 과 같은 것이 IntRange
        print(i )             // 1..10 == IntRange(1, 10)
        print(".")
    }
    println()

    for(i in IntRange(1, 10)) {
        print(i)
        print(".")
    }
    println()

    for(i in 1 until 10) { // until은 끝 수의 전 까지 출력(10 이전이므로 9까지 출력)
        print(i)
        print(".")
    }
    println()

    for(i in 1..10 step(2)) { // step을 지정해서 숫자가 n만큼 커지게 할 수 있음
        print(i)
        print(".")
    }
    println()

    for(i in 10 downTo 1 step(2)) { // 작아지는 수를 출력
        print(i)
        print(".")
    }
    println()

    var c = 1
    while(c<11) { // while문의 사용
        print(c)
        print(".")
        c++
    }
}