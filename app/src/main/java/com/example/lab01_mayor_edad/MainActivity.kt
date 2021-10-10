package com.example.lab01_mayor_edad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnProcess.setOnClickListener {
            var age = edtAge.text.toString().toInt()

            if (age >= 18) {
                tvResult.text = "Usted es mayor de edad"
            } else {
                tvResult.text = "Usted es menor de edad"
            }
        }

    }
}