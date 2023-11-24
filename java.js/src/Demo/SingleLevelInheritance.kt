package Demo

//fun main(){
//    val s = Outer.SubClass()
//    s.protectedFunction()
//    s.accessProtectedNested()
//    println(s.name)
//}
//open class Outer {
//    val name = "name"
//    fun protectedFunction() {
//        println("Protected function in ProtectedNested")
//    }
//
//    class SubClass : Outer() {
//        fun accessProtectedNested() {
//            println("function in accessProtectedNested")
//        }
//    }
//}

open class SingleInheritance(name: String, age:Int,salary:Int) {
    init {
        println("name is $name, age $age and earning salary $salary")
    }
}
class Ios(name: String, age:Int,salary:Int) : SingleInheritance(name,age,salary) {
    fun ios(){
        println("ios developer")
    }
}

class android(name: String, age:Int, salary:Int) : SingleInheritance(name,age,salary){
    fun and(){
        println("android developer")
    }
}

fun main() {
    val i = Ios("name", 23, 300)
    i.ios()
    val  a = android("name1", 22, 400 )
    a.and()
}