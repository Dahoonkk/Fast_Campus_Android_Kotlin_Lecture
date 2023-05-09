package com.example.android_kotlin_lecture.Chapter_02

/*
3. Scope Function(범위 지정함수)
- 코틀린 표준 라이브러리에서 제공하는 확장함수
- 목적 : 간결성, 명료성, 유지보수 용이성
- 정의 : 객체의 컨텍스트 내에서, 실행 가능한 코드 블럭을 만드는 함수
        호출 시, 임시 범위가 생성되며 이 범위 안에서는 이름 없이 객체에 접근 가능
        -> context : 문맥, 맥락, 전후 사정
- 수신 객체(receiver) : 확장 함수가 호출되는 대상이 되는 값(객체)
- 수신 객체 지정 람다(lambda with receiver) : 수신 객체를 명시하지 않고, 람다의 본문 안에서 해당 객체의 메서드를 호출할 수 있게 하는 것
- 차이점
    -> 수신 객체 접근 방법 : this, it
    -> Return 값 : 수신객체, 마지막 행(lambda result)

<코틀린 범위 지정함수>
      수신객체 | 확장 함수로 호출 | 함수의 인자
this(생략가능) | apply | run  | with
it (생략 불가) | also  | let  |
return      | 수신객체 | 감다 식의 마지막 행

- let : null 체크를 해야할 때, 지역 변수를 명시적으로 표현 해야할 때
- run : 객체를 초기화하고 리턴 값이 있을 때
- apply : 객체 초기화
- also : 수신객체를 명시적으로 사용하고 싶을 때, 로그를 남길 때
- with : 객체 초기화, 람다 리턴 값이 필요 없을 때
 */

fun main() {
    // let, run, apply, also   with
    val a = 3
    a.let { }
    val user = User("dahoon" , 10, true)

    // 수신객체.let { it(or 여기서는 user(명시적 지정)) -> (it은 생략 불가)
    //
    // 마지막 줄 // return
    // }
    val age = user.let {
        user.age
    }
    println(age)

    val user2 : User? = User("dahoon", 10, true)
    val age2 = user?.let {
        it.age
    }
    println(age2)

    // 2. run
    // 수신객체.run { this -> (this 생략 가능)
    //
    // 마지막 줄 // return
    // }
    val kid = User("kid", 4, false)
    val kidAge = kid.run {
        this.age //let 과는 다르게 this로 받아야 하며 생략 가능
    }
    println(kidAge)

    // 3. apply
    // 수신객체.apply { (run과 마찬가지)
    //  아무 값,,
    //
    // }
    // return 값이 수신객체 자기 자신
    val kidName = kid.apply {
        name
    }
    println(kidName) // 객체 자기 자신을 return
    val female = User("jimin", 20, true, true)
    val fValue = female.apply {
        hasGlasses = false
    }
    println(fValue.hasGlasses) // false 리턴

    // 4. also
    // 수신객체.also { it ->
    //
    //
    // } // return 수신객체 (자기자신)
    val male = User("minsu", 17, false, true)
    val maleValue = male.also { // 로그를 찍을 때 많이 사용됨
        println(it.name) // 로그를 찍는 용도
        user.name
        user.hasGlasses = false
    }
    println(maleValue)
    println(maleValue.hasGlasses)

    // 5. with
    // with(수신객체) { this -> (this 생략 가능)
    //   ---
    // 마지막줄 // return
    // }
    val result = with(male) {
        hasGlasses = false
        true
    }
    println(result)
}

class User(
    val name : String,
    val age: Int,
    val gender : Boolean,
    var hasGlasses : Boolean = true,
)