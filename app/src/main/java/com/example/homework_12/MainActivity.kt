package com.example.homework_12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.btn_navigate_to_first_activity
import kotlinx.android.synthetic.main.activity_second.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_navigate_to_first_activity.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }

        btn_navigate_to_second_activity.setOnClickListener {
            val intent = Intent (this, SecondActivity::class.java)
            startActivity(intent)
        }

        btn_navigate_to_third_activity_1.setOnClickListener {
            val intent = Intent (this, ThirdActivity::class.java)
            startActivity(intent)
        }
    }
}