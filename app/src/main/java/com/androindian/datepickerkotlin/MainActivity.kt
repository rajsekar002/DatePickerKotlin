package com.androindian.datepickerkotlin

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var YY: Int=0
    var MM: Int=0
    var DD: Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        select.setOnClickListener {
            var calendar=Calendar.getInstance()

            YY=calendar.get(Calendar.YEAR)
            MM=calendar.get(Calendar.MONTH)
            DD=calendar.get(Calendar.DATE)


            var datePickerDialog=DatePickerDialog(this@MainActivity,
            DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                showdate.setText(year.toString()+"/"+month+"/"+dayOfMonth)

            },YY,MM,DD)

            datePickerDialog.show()


        }
    }
}
