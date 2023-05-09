package com.example.ideia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ideia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btHome.setOnClickListener {
            val secondActivity = Intent(this, SegundaActivity::class.java)
            startActivity(secondActivity)
        }
        binding.btHome.setOnClickListener {
            val secondActivity = Intent(this, SegundaActivity::class.java)
            startActivity(secondActivity)
            overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up)
        }

    }
}

