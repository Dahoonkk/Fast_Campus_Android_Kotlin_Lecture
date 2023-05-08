package com.example.android_kotlin_lecture.Chapter_01

// 7. 컬렉션
// 자바와 코틀린의 큰 차이점은 코틀린에는 mutable과 immutable이 있다는 점
// 기본적으로 immutable
fun main() {
    val list = mutableListOf(1,2,3,4,5)
    list.add(6)
    list.addAll(listOf(7,8,9))

    val list1 = listOf(1,2,3,4)
    // list1.add(5) -> mutable로 지정하지 않았기 때문에 읽기만 가능(immutable)
    list.get(0)
    list[0]
    println(list1.map{it*10}.joinToString("/")) // 각 원소를 10씩 곱하여 /로 구분하여 출력

    println(list.joinToString(","))

    val map = mapOf((1 to "hellO"), (2 to "hi"))
    val map1 = mutableMapOf((1 to "hello"), (2 to "hi"))
    map1[3] = "yes"
    map1[100] = "no"

    val diverseList = listOf(1, "hello", 1.78, true) // 다양한 타입을 넣을 수 있음


}