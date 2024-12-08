package com.yehia.secondtrail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.yehia.secondtrail.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var array  = mutableListOf<movie>()

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        add()
        val obj = MyAdapter(array)
        binding.movieRv.adapter = obj
        binding.movieRv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        binding.toolbar.setTitle("Hebesha")
        setSupportActionBar(binding.toolbar)
    }


    private  fun add(){
        var m = movie("aot",R.drawable.aot)
         array.add(m)
         m = movie("avengers",R.drawable.avgend)
        array.add(m)
         m = movie("captain america",R.drawable.captainamerica)
        array.add(m)
         m = movie("Inspection",R.drawable.insepction)
        array.add(m)
         m = movie("Shad 2gaz2",R.drawable.shadagzaa)
        array.add(m)
         m = movie("DemonSlayer",R.drawable.demonslayer)
        array.add(m)
          m = movie("Wolvrine",R.drawable.wolvrine)
          array.add(m)
          m = movie("Tohyo drift",R.drawable.tokyodrift)
          array.add(m)
          m= movie("man of steel" , R.drawable.manofstell)
          array.add(m)
          m = movie("Spiderman IntoSpiderVerse" , R.drawable.spman)
    }

}