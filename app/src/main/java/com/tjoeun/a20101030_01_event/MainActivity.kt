package com.tjoeun.a20101030_01_event

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // xml에 그려진 초기 값 이라고 적힌 텍스트뷰의 글자를 "실행 후"로 변경

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstTextView.text = "실행 후"

        okBtn.setOnClickListener {
            firstTextView.text = "확인버튼 클릭됨"
        }

        okBtn.setOnLongClickListener{
            firstTextView.text = "확인버튼 롱클릭"
            return@setOnLongClickListener true
        }

        // @라벨에 대한 예시. 책 49page
        firstFor@ for (i in 0..10){
            secondFor@ for (j in 0..10){
                if (j==2){
                    break@firstFor
                }
            }
        }

        var stringList:ArrayList<String> = ArrayList()

        stringList.add("신정식")   // "신정식" 글자를 배열에 추가
        stringList.add("조경진")   // "조경진" 글자를 배열에 추가
        stringList.add("홍길동")   // "홍길동" 글자를 배열에 추가

        var intList:ArrayList<Int> = ArrayList()
        intList.add(10)             // 숫자 10을 배열에 추가
        intList.add(30)             // 숫자 30을 배열에 추가
        intList.add(50)             // 숫자 50을 배열에 추가

        Log.d("정수배열의길이", String.format("%d", intList.size))

        // "홍길동"은 몇번째로 넣었을까? 어느 위치?
        val indexOfHong = stringList.indexOf("홍길동")
        Log.d("정수배열의위치", String.format("%d", indexOfHong))

        // "홍길동"을 제거
        stringList.remove("홍길동")

        var a = 10
        var b = 20

        var c = if(a==b){
            Log.d("로그","둘이 같다.")
        } else {
            Log.d("로그", "둘이 다르다.")
        }   //이런 문법도 가능 책기준 39page

        when(a){
            0,1 -> Log.d("when연습", "a가 0이나 1이다")
            in 2..5 -> Log.d("when연습", "a가 2~5 사이다")
            in intList -> Log.d("when연습", "a가 intList에 포함")
            !in intList -> Log.d("when연습", "a가 intList에 불포함")
        }

    }
}
