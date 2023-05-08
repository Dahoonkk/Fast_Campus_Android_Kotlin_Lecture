package com.example.android_kotlin_lecture.Chapter_01

// 5. 조건식

fun main() {
    max(10, 3)
    max2(10,3)
    isHoliday("금")
}

fun max(a: Int, b: Int)  { // 자바와 유사한 형태
    if(a>b) {
        println(a)
    } else {
        println(b)
    }
}

fun max2(a: Int, b: Int) {
    val result = if(a>b) { // Kotlin은 자바와 다르게 Expression을 사용할 수 있음
        println(a)
    } else {
        println(b)
    }
    println(result)
    // 자바와 코틀린의 조건식의 차이는 자바는 조건문으로 statement이고 코틀린은 식이다.
}

fun max3(a: Int, b: Int) {
    val result = if(a>b) a else b // kotlin에는 삼항연산자는 없지만 다음과 같이 사용하여 조건문을 구현할 수 있음
    println(result)
}

// 월 화 수 목 금 토 일
fun isHoliday(dayOfWeek: Any) {
    val result = when(dayOfWeek) {
        "월" -> true
        "화" -> true
        "수" -> true
        "목" -> true
        in 2..4 -> {} // 조건식이 들어갈 수 있으며
        in listOf(1,3,4) -> {} // listOf와 같이 다양하게 여러 조건을 사양할 수 있음
        else -> false // expression(식)을 사용하는 경우에는 else가 필수임
    }
    println(result)
    /* 다음과 같이도 사용할 수 있음
    val result = when(dayOfWeek) {
        "월", "화", "수", "목" -> true
        "금", "토", "일" -> false
    }

    val result = when(dayOfWeek) {
        "월", "화", "수", "목" -> true
        else -> false
    }
     */

    /* 값을 다시 받아서 사용해야 하는 경우 아래와 같이 사용할 수 있음
    when(val day = dayOfWeek) {
        "토", "일" -> if(day == "토") "좋아" else "너무 좋아"
        else -> "안좋아"
    }
     */
}