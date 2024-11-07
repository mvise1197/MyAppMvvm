package com.miguelvise.myappmvvm.viewmodel

import androidx.lifecycle.ViewModel
import com.miguelvise.myappmvvm.model.CalculatorData

class CalculatorViewModel: ViewModel() {
    fun calculateSum(number1: Int, number2: Int): CalculatorData{
        val sum = number1 + number2
        return CalculatorData(number1,number2,sum)
    }
}