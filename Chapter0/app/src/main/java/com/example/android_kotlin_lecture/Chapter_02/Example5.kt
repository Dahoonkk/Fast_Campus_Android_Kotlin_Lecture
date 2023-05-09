package com.example.android_kotlin_lecture.Chapter_02

/*
5. 코틀린의 Data, Sealed class
- Data class : 데이터를 담기위한 클래스
    -> toString(), hashCode(), equals(), copy() 메서드를 자동으로 생성
        => override하면 직접 구현한 코드를 사용
    -> 1개 이상의 프로퍼티가 있어야 함
    -> 데이터 클래스는 abstract, open, sealed, inner를 붙일 수 있음
    -> 상속이 불가능

- Sealed class : 추상 클래스로, 상속받은 자식 클래스의 종류를 제한
    -> 컴파일러가 sealed 클래스의 자식 클래스가 어떤 것인지 앎
    -> when과 함께 쓰일 때, 장점을 느낄 수 있음
 */

fun main() {
    val person = Person("suzi", 24)
    val dog = Dog("happy", 24)

    println(person.toString())
    println(dog.toString())
    println(dog.copy(age = 3).toString())

    val cat : Cat = BlueCat()
    val result = when(cat) {
        is BlueCat -> "blue"
        is RedCat -> "red"
        is GreenCat -> "green"
        else -> "none" // 추상클래스일 경우 컴파일러는 cat 이하에 뭐가 상속되어 있는지 알지 못하기 때문에 else를 꼭 써줘야 함
    }
    val cat2 : Cat2 = BlueCat2()
    val result2 = when(cat2) {
        is BlueCat2 -> "blue"
        is RedCat2 -> "red"
        is GreenCat2 -> "green"
        else -> "none"  // sealed일 경우 else가 redundant로 변함 -> 어떤 자식들을 가지고 있는지 알고 있게 됨 -> 따라서 else 생략 가능
        // 만약 cat2에 구현되어 있지 않은 새로운 조건을 넣는 경우 (ex. WhiteCat -> "white")
        // 에러 발생 -> 왜냐하면 sealed 클래스는 추상 클래스이면서 자식 클래스가 어떤게 있는지 알기 때문
    }
}

class Person(
    val name:String,
    val age:Int,
)

data class Dog(
    val name:String,
    val age:Int,
) /*{
    override fun toString() : String { // 오버라이딩하여 사용할 수 있음
        return "직접 구현 $name"
    }
}*/

/*
data class Corgi(
    val pretty : Boolean = true
) : Dog() // 상속 받을 수 없음 -> 데이터 클래스는 상속 불가
 */

// sealed Class
abstract class Cat
class BlueCat : Cat()
class RedCat : Cat()
class GreenCat : Cat()

sealed class Cat2
class BlueCat2 : Cat2()
class RedCat2 : Cat2()
class GreenCat2 : Cat2()