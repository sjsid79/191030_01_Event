package com.tjoeun.a20101030_01_event

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // xml에 그려진 초기 값 이라고 적힌 텍스트뷰의 글자를 "실행 후"로 변경

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstTextView.text = "실행 후"
    }
}
