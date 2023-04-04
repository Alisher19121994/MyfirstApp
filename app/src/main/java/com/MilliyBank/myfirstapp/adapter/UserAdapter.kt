package com.MilliyBank.myfirstapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.MilliyBank.myfirstapp.R
import com.MilliyBank.myfirstapp.activity.model.User
import com.google.android.material.imageview.ShapeableImageView

class UserAdapter(var list:ArrayList<User>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.telegram_item,parent,false)
        return UserViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
       val getData = list[position]
        if (holder is UserViewHolder){
            holder.pro_image.setImageResource(getData.image)
            holder.pro_fullname.text = getData.fullname
        }

    }

    inner class UserViewHolder(view: View):RecyclerView.ViewHolder(view){

        val pro_image:ShapeableImageView = view.findViewById(R.id.profile_image_id)
        val pro_fullname:TextView = view.findViewById(R.id.pro_fullname_id)

    }
}