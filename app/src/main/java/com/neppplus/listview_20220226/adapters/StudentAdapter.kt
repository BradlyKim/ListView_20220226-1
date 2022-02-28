package com.neppplus.listview_20220226.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.neppplus.listview_20220226.R
import com.neppplus.listview_20220226.datas.StudentData

class StudentAdapter(
    val mContext : Context,  // 어느 화면에서?
    val resId: Int, // 어떤 xml을 기반으로?
    val mList : ArrayList<StudentData>  // 실제로 뿌려줄 학생들은 누구누구? 목록
) : ArrayAdapter<StudentData>(mContext, resId, mList) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow  = convertView

        if (tempRow == null) {

            tempRow =  LayoutInflater.from(mContext).inflate(R.layout.student_list_item, null)

        }

        val row =  tempRow!!

//        각 row의 UI에 > 자리에 맞는 사람 데이터를 반영.

//        mList 변수에 => 액티비티에서 적어넣은 실제 학생 목록이 들어있다.

        val data =  mList[ position ]

//        row의 텍스트뷰 등등에, data 변수가 가진 하위 정보들을 반영

//        row의 UI태그들을 => 직접 변수로 만들어내야함.
        val txtStudentName = row.findViewById<TextView>(R.id.txtStudentName)
        val txtAge = row.findViewById<TextView>(R.id.txtAge)
        val txtAddress = row.findViewById<TextView>(R.id.txtAddress)


        txtStudentName.text =  data.name
        txtAddress.text = data.address


//       StudentData에 추가한 함수 활용 예시

        txtAge.text = "(${ data.getKoreanAge(2022) }세)"


//        반영된 채로 결과로 나가게
        return row
    }


}