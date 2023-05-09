package com.example.android_kotlin_lecture.Chapter_02

// import com.example.android_kotlin_lecture.Chapter_02.Book.Companion.NAME
import com.example.android_kotlin_lecture.Chapter_02.Book.Novel.NAME

/*
6. Object, Companion Object
- Object : 클래스를 정의함과 동시에 객체를 생성
    -> 싱글톤을 쉽게 만들 수 있는 키워드
    -> 생성자 사용 불가
    -> 프로퍼티, 메서드, 초기화 블록은 사용 가능
    -> 다른 클래스나, 인터페이스를 상속받을 수 있음
- Companion Object : 동반객체
    -> Java의 static과 동일한 역할
    -> 클래스 내에 하나만 생성할 수 있음
 */

fun main() {
    Counter // 선언과 동시에 오직 딱 한번만 생성됨
    println(Counter.count)
    Counter.countUp()
    println(Counter.count)
    Counter.countUp()
    println(Counter.count)

    Counter.hello()
    Book.create()
    NAME // import 되어 사용됨 (companion object Book)

}

open class Hello() {  // 상속하기 위해 open으로 선언
    fun hello() = println("Hello")
}

object Counter : Hello() { // object는 에러코드를 만들 때 많이 사용됨
    init {  // 초기화 블럭
        println("카운터 초기화") // 객체를 불러오면 한번만 출력
    }
    var count = 0
    fun countUp() {
        count++
    }
}

class Book {
    companion object Novel{ // static과 같은 역할
        const val NAME = "dahoon"
        fun create() = Book()
    }
}