package com.example.android_kotlin_lecture.Chapter_01

// 4. Class
fun main() {
    val user = User("dahoon")
    println(user.age)
    Kid("아이", 3, "male")
}

open class User(open val name : String, open var age : Int = 26)

// Kotlin Class는 constructor와 property의 역할을 한 번에 할 수 있음
class Kid(override val name : String, override var age: Int) : User(name, age) {
    var gender : String = "female"

    init {
        println("초기화 중 입니다.")
    }

    constructor(name: String, age: Int, gender: String) : this(name, age) {
        this.gender = gender
        println("부생성자 호출")
    }
}
// kotlin의 경우 상속을 권장하지 않기 때문에 상속을 사용하기 위해서는 open 키워드를 사용해야 함