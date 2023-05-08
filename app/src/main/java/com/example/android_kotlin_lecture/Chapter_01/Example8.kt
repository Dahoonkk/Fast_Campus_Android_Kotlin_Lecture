package com.example.android_kotlin_lecture.Chapter_01

// 8. Null
fun main() {
    var name: String = "다훈" // null이 들어갈 수 없는 String이 선언됨
    // name = null -> 에러 발생
    var nickname: String? = "ekgns" // ?를 붙이면 null이 들어갈 수 있음

    /*
    val result = if(nickname == null) {
        "값이 없음"
    } else {
        nickname
    }
    println(result)
     */

    // kotlin의 표현
    nickname = "안녕"
    val result = nickname?: "값이 없음"
    println(result)

    nickname = null
    val size = nickname?.length // null인 경우 null return 아닌 경우 값 리턴(?를 사용하기 때문에)
    // ?를 사용하지 않으면 Exception이 발생함
    println(size)
}