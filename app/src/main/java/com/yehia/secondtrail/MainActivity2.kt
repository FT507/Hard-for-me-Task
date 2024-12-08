package com.yehia.secondtrail

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.yehia.secondtrail.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding2 : ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding2 = ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding2.root)

    }
}