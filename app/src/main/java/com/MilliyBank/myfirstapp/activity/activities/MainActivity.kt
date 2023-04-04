package com.MilliyBank.myfirstapp.activity.activities

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.MilliyBank.myfirstapp.R
import com.MilliyBank.myfirstapp.activity.model.User
import com.MilliyBank.myfirstapp.adapter.UserAdapter

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }
    private fun initViews() {

        recyclerView = findViewById(R.id.recyclerView_id)
        recyclerView.layoutManager = LinearLayoutManager(this)

        refreshAdapter(data())

    }

    private fun refreshAdapter(user:ArrayList<User>){
        val adaper = UserAdapter(user)
        recyclerView.adapter = adaper
    }

    private fun data():ArrayList<User>{

        val user = ArrayList<User>()

        for (i in 1..20){
            user.add(User(R.drawable.muc,"Alisher Daminov"))
        }

        return user
    }


}