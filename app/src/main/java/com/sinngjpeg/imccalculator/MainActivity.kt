package com.sinngjpeg.imccalculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sinngjpeg.imccalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnCalculator = binding.btnCalculate
        val editHeight = binding.edtHeight
        val editWeight = binding.edtWeight

    }
}