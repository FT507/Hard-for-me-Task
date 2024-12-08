package com.yehia.secondtrail

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.collection.longSetOf
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.yehia.secondtrail.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
     lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val lis = listOf(add())
        val obj = MyAdapter(emptyList())
        binding.movieRv.adapter = obj
        binding.movieRv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        binding.toolbar.setTitle("Hebesha")
        setSupportActionBar(binding.toolbar)


    }

    private  fun add(){
        var m = movie("aot",R.drawable.aot)
        lis.add(m)
        var m = movie("avengers",R.drawable.avgend)
        lis.add(m)
        var m = movie("captain america",R.drawable.captainamerica)
        lis.add(m)
        var m = movie("Inspection",R.drawable.insepction)
        lis.add(m)
        var m = movie("Shad 2gaz2",R.drawable.shadagzaa)
        lis.add(m)
        var m = movie("DemonSlayer",R.drawable.demonslayer)
        lis.add(m)


    }

}