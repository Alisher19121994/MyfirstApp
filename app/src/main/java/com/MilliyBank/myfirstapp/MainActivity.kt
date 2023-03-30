package com.MilliyBank.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {


    /// ahjgashgshfgjshdgfhjsdgfjhsgjfhs

    lateinit var button:AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }
    private fun initViews() {
        button = findViewById(R.id.clickAppCompatButton_id)
        button.setOnClickListener {
            val openActivity = Intent(this@MainActivity,MainActivity2::class.java)
            startActivity(openActivity)
        }
    }

}