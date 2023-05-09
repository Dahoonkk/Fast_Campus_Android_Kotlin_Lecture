package com.example.android_kotlin_lecture.Chapter_02

/*
4. 코틀린의 초기화 지연 lateinit, lazy
- 정의 : 변수를 선언할 때 값을 지정하지 않고, 나중에 지정할 수 있는 방법
- 목적 : 메모리를 효율적으로 사용하기 위해, null safe한 value를 사용하기 위해
- lateinit, var
    -> 변수 타입을 지정해줘야 함
    -> primitive 타입은 사용할 수 없음 -> 사용하려면 값을 할당하거나 참조 타입으로 바꿔줘야 함
    -> 선언 후, 나중에 초기화 해줘도 됨
- lazy, val
    -> 선언과 동시에 초기화를 해야함
    -> 호출시점에 초기화가 이루어짐
 */

lateinit var text : String //  어떤 타입인지 지정해줘야 함
val test : Int by lazy { // 호출하는 시점에 초기화 됨
    println("초기화 중")
    100
}

fun main() {
    text = "name"

    println(text)
    println("main start")
    println("초기화한 값 $test")
    println("두번째 호출 $test")
}