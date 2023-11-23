package Demo

import java.lang.Exception
import java.util.ArrayList

class Calculator {

    fun add(arg1 : Int, arg2: Int) : Int {
         val c: Int = arg1+arg2
        return c
    }
    fun sub(arg1 : Int, arg2: Int) : Int {
        return arg1-arg2
    }
    fun multiply(arg1 : Int, arg2: Int) : Int {
        return arg1*arg2
    }

    fun div(arg1: Int, arg2: Int): Int {
        return try {
            arg1 / arg2
        } catch (e: Exception) {
            println("cannot divided zero")
            return 0
        }
    }

    fun modules(arg1 : Int, arg2: Int) : Int {
        return arg1%arg2
    }
}

fun main() {

    val arrayList = ArrayList<Int>()
    val cal = Calculator()
//    println("modules = " + cal.modules(2,4))
//    println("subtraction = " + cal.sub(20,10))
//    println("addition = " + cal.add(10,5))
//    println("multiply = " + cal.multiply(5,2))
//    println("div = " + cal.div(2,0))

//    try {
//        val result = cal.div(2,0)
//        println("divide = $result")
//    } catch (exception : Exception){
//        println("divide = ${exception.message}")
//    }


    val addition = cal.add(1,3)
    val subtraction = cal.sub(20,10)
    val multiply = cal.multiply(2,2)
    val division = cal.div(10,0)

    arrayList.add(addition)
    arrayList.add(subtraction)
    arrayList.add(multiply)
    arrayList.add(division)

    println("addition = $addition")
    println("subtraction = $subtraction" )
    println("addition = $multiply")
    println("div = $division")


//    try {
//        arrayList.add(cal.div(12,2))
//    } catch (exception : ArithmeticException) {
//        println("div = ${exception.message}")
//    }

    for (x in arrayList){
        println("Results stored in ArrayList = $x")
    }

}