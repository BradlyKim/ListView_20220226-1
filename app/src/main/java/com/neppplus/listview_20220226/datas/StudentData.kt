package com.neppplus.listview_20220226.datas

import java.time.Year

class StudentData(
    val name: String,
    val birthYear: Int,
    val address: String,
) {

//    연도를 받아서 ? 그 해의 나이를 계산해주는 함수

    fun getKoreanAge( year: Int ) : Int {

        val age = year - birthYear + 1

        return age

    }

}