package com.example.android_kotlin_lecture.Chapter_01

fun main() {
    println("Hello Kotlin!!")
    test()
    val result = test2(1, 3)
    println(result)
    test3("구다훈", "다훈", "다훈님")
    test3(id="다훈님", name = "구다훈", nickname="다훈") // 명시적으로 인자를 지정해서 사용할 수 있음
    println(time1(1,3))
    println(time2(1,3))
}

// 2. 함수
fun test() : Unit {  // Unit은 자바의 void와 같음 (생략 가능)
    println("test")
}

fun test2(a: Int, b: Int = 3) : Int { // 오버로딩 대신 디폴트 값을 선언해 간결하게 사용할 수 있음
    println(a+b)
    return a + b
}

fun time1(a : Int, b: Int,) : Int { // 두 번째 인자 뒤에 트레일링 컴마가 들어가도 에러가 나지 않음
    return a * b
}

fun time2(a: Int, b: Int) = a*b

fun test3(name : String, nickname : String, id: String) {

}