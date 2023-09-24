package com.knackpark.simplecalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val sum = findViewById<Button>(R.id.sum)
        val sub = findViewById<Button>(R.id.sub)
        val mul = findViewById<Button>(R.id.mul)
        val div = findViewById<Button>(R.id.div)
        val display = findViewById<TextView>(R.id.display)

        val inputOne = findViewById<EditText>(R.id.firstInput)
        val inputTwo = findViewById<EditText>(R.id.secondInput)








            sum.setOnClickListener {

                val input1 = inputOne.text.toString().toFloat()
                val input2 = inputTwo.text.toString().toFloat()
                display.text = "${input1+input2}"
            }

            sub.setOnClickListener {
                val input1 = inputOne.text.toString().toFloat()
                val input2 = inputTwo.text.toString().toFloat()
                display.text = "${input1-input2}"
            }

            mul.setOnClickListener {
                val input1 = inputOne.text.toString().toFloat()
                val input2 = inputTwo.text.toString().toFloat()
                display.text = "${input1*input2}"
            }

            div.setOnClickListener {
                val input1 = inputOne.text.toString().toFloat()
                val input2 = inputTwo.text.toString().toFloat()
                display.text = "${input1/input2}"
            }






    }
}