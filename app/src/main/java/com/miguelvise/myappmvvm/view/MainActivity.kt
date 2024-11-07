package com.miguelvise.myappmvvm.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.miguelvise.myappmvvm.databinding.ActivityMainBinding
import com.miguelvise.myappmvvm.viewmodel.CalculatorViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var calculatorViewModel: CalculatorViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        enableEdgeToEdge()
        setContentView(binding.root)

        calculatorViewModel = ViewModelProvider(this).get(CalculatorViewModel::class.java)

        binding.calculateButton.setOnClickListener{
            val number1 = binding.editTextNum1.text.toString().toInt()
            val number2 = binding.editTextNum2.text.toString().toInt()

            val result = calculatorViewModel.calculateSum(number1, number2)

            binding.resultTextView.text = "${result.sum}"
        }
    }
}