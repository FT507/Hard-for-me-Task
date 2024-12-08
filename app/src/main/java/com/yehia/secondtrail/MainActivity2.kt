package com.yehia.secondtrail

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
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
            val esize : Int = binding2.em.text.length
            val psize : Int = binding2.pass.text.length
            if(esize < 8 || psize < 8  ){
                Toast.makeText(this,"Invalid",Toast.LENGTH_SHORT).show()
                Snackbar.make(binding2.root,"Size Must be 8 or more",Snackbar.LENGTH_SHORT).show()
            }else{
            Toast.makeText(this,"Valid",Toast.LENGTH_SHORT).show()
            val intent = intent ( this , MainActivity::class.java)
            startActivity(intent)
                finish()
            }

        }


    }

    private fun intent(mainActivity2: MainActivity2, java: Class<MainActivity>): Intent? {
        TODO("Not yet implemented")
    }
}