package com.yehia.secondtrail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.yehia.secondtrail.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var array  = mutableListOf<movie>()
    private  fun add(){
        var m = movie("Attack On Titan",R.drawable.aot)
        array.add(m)
        m = movie("Avengers",R.drawable.avgend)
        array.add(m)
        m = movie("captain america",R.drawable.captainamerica)
        array.add(m)
        m = movie("Inspection",R.drawable.insepction)
        array.add(m)
        m = movie("Shad 2gaz2",R.drawable.shadagzaa)
        array.add(m)
        m = movie("DemonSlayer",R.drawable.demonslayer)
        array.add(m)
        m = movie("Wolverine",R.drawable.wolvrine)
        array.add(m)
        m = movie("Tokyo drift",R.drawable.tokyodrift)
        array.add(m)
        m= movie("Man of steel" , R.drawable.manofstell)
        array.add(m)
        m = movie("Spider man IntoSpiderVerse" , R.drawable.spman)
    }







    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        add()
        val obj = MyAdapter(array)
        binding.movieRv.adapter = obj
        binding.movieRv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        binding.toolbar.setTitle("Film")
        setSupportActionBar(binding.toolbar)


    }




}