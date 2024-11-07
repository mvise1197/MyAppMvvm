package com.miguelvise.myappmvvm.model

data class CalculatorData(
    val number1: Int,
    val number2: Int,
    val sum: Int,
)

/*fun calculateSum(number1: Int, number2: Int,): CalculatorData{
    val sum = number1 + number2
    return CalculatorData(number1,number2, sum)
}

fun main(){
    val result = calculateSum(10, 50)
    println(result)
}*/
