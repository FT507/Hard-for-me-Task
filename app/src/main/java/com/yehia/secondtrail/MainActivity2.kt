package com.yehia.secondtrail

import android.os.Bundle
import android.widget.Toast
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
        val e = binding2.em.text
        val p = binding2.pass.text
        binding2.btn.setOnClickListener(){
            Toast.makeText(this,e,Toast.LENGTH_SHORT).show()
        }


    }
}