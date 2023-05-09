package com.example.android_kotlin_lecture.Chapter_02

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.android_kotlin_lecture.R

class Example1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val view = View(this)

        /* 자바의 setOnClickListener
        view.setOnclickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View: View) {

                }
            }
        )

         */

        // 코틀린에서는 람다로 간단하게 표현할 수 있음
        view.setOnClickListener({println("안녕")})
    }
}