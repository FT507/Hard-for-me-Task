package com.yehia.secondtrail

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView


class MyAdapter(private val items: List<movie>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val MovieT : TextView = view.findViewById(R.id.movietitle)
        val MovieI : ImageView = view.findViewById(R.id.movieimage)
        val MovieN : TextView = view.findViewById(R.id.movieinfo)
        val card :  CardView = view.findViewById(R.id.cardview)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(
                R.layout.rv_list
                ,parent
                ,false
            )
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
         holder.MovieT.text = items[position].t
        holder.MovieI.setImageResource(items[position].i)


    }

    override fun getItemCount(): Int {
        return items.size
    }
}