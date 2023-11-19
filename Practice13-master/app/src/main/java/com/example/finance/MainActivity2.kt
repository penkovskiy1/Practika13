package com.example.finance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.StrictMode
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.pow
import kotlin.math.sqrt

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    var A: String = ""
    var B: String = ""
     fun btnOp(view: View){
        val btn =view as Button
        val edtv:EditText = findViewById(R.id.editTextNumber)
        val edtv2:EditText = findViewById(R.id.editTextNumber2)
        val tv: TextView = findViewById(R.id.textView9)
        if (edtv!!.text.toString() == "") {
            Toast.makeText(this, "Введите катет А!", Toast.LENGTH_SHORT).show()
            edtv.requestFocus()
        }
        else if ( edtv2!!.text.toString() == ""){
            Toast.makeText(this, "Введите катет В", Toast.LENGTH_SHORT).show()
            edtv.requestFocus()
        }
         else when (btn.id){
            R.id.button3 -> {
                A = edtv.text.toString()
                B = edtv2.text.toString()
                btnGipotez(A,B)
            }
            R.id.button4 -> {
                A = edtv.text.toString()
                B = edtv2.text.toString()
                var C:String = sqrt(A.toDouble().pow(2.0) + B.toDouble().pow(2.0)).toString()
                tv.text = (A.toDouble() + B.toDouble() + C.toDouble()).toString()
            }
            R.id.button5 -> {
                A = edtv.text.toString()
                B = edtv2.text.toString()
                Square(A,B)
            }
        }
    }
   fun btnGipotez(A:String, B:String){
       val tv: TextView = findViewById(R.id.textView9)
       tv.text = sqrt(A.toDouble().pow(2.0) + B.toDouble().pow(2.0)).toString()
   }

    fun Square(A: String, B: String){
        val tv: TextView = findViewById(R.id.textView9)
        tv.text = ((A.toDouble() * B.toDouble()) / 2).toString()
    }
}