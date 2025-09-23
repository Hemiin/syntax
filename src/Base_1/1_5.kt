package Base_1

import kotlin.math.pow

fun main(){
    println("Введите целое число: ")
    val chislo: String = readln()
    println("Введите основание степени: ")
    val step: String = readln()
    println(chislo.toFloat().pow(step.toFloat()))
    //coming soon
}