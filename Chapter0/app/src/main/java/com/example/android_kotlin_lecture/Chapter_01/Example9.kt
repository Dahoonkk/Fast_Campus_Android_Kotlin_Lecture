package com.example.android_kotlin_lecture.Chapter_01

// 9. 타입 체크와 캐스팅
fun main() {
    println(check("안녕"))
    println(check(3))
    println(check(true))

    cast("안녕")
    cast(10) // ?를 쓰지 않으면 에러가 날거임(스트링으로 변환을 할 수 없기 때문)
    // ?를 붙이게 되면 null 리턴

    println(smartcast("안녕"))
    println(smartcast(10))
    println(smartcast(true))
}

fun check(a: Any) : String {
    return if(a is String) {
        "문자열"
    } else if(a is Int) {
        "숫자"
    } else {
        "몰라요"
    }
    /* 위의 조건식을 when 문으로 사용할 수 있음
    return when (a) {
        is String -> {
            "문자열"
        }

        is Int -> {
            "숫자"
        }

        else -> {
            "몰라요"
        }
    }
     */
}

fun cast(a : Any) {
    val result = (a as? String) ?: "실패"
    println(result)
}

fun smartcast(a: Any): Int {
    return if(a is String) {
        a.length // 스마트 캐스팅
    } else if(a is Int) {
        a.dec()
    } else {
        -1
    }
}