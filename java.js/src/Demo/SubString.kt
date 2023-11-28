package Demo

fun main() {
    var student : Student? = Student(age =25, phoneNumber = "8015242117", name = "Thangapandiyan")
}
data class Student(val name: String, val phoneNumber: String,val age:Int,val landmark:String? = null)

//open class MyBaseClass {
//    open val myProperty: Int = 10
//}
//
//class MySubClass : MyBaseClass() {
//    override val myProperty: Int = 10
//}
//
//fun main() {
//    val obj1: MyBaseClass = MySubClass()
//    println(obj1.myProperty)
//
//}

//fun demo1() {
//    val list = mutableListOf(1,2,4,5,2,3)
//    list.let {
//        it.add(4)
//        it.removeAt(2,)
//        it
//    }
//    println(list)
//}
//
//
//fun demo2() {
//    val list = mutableListOf(1,2,4,5,2,3)
//    val a2 =  listOf(1,3)
//}

//fun main() {
//    val mutableList = mutableListOf("one", "two", "three", "four", "five")
//    val indicesToRemove = listOf(1, 3) // Indices of elements to be removed
//
//    mutableList.removeIfIndexed { index, _ -> index in indicesToRemove }
//
//    println("Updated list after removals: $mutableList")
//}


//fun main() {
//    demo1()
//    demo2()
//}

//interface MyInterface {
//    val test: Int
//    fun foo() : String
//   fun hello() {
//       println("Hello there, pal!")
//    }
//}
//
//class InterfaceImp : MyInterface {
//    override val test: Int = 25
//    override fun foo() = "Lol"
//    override fun hello() {
//        println("Overridden hello() in InterfaceImp")
//    }
//}
//
//fun main(args: Array<String>) {
//    val obj = InterfaceImp()
//    println("test = ${obj.test}")
//    print("Calling hello(): ")
//    obj.hello()
//    print("Calling and printing foo(): ")
//    println(obj.foo())
//}
//
//open class DES : MyInterface {
//    override val test: Int = 25
//    override fun foo() = "Lol"
//    override fun hello() {
//        println("hello from DES")
//    }
//}

//fun main() {
////    println(A.a)
////    println("from class a $A.demo()")
//    print(Asd.demo())
//}

//class A {
//    companion object {
//        val a = 10
//        fun demo() {
//            print("from demo")
//        }
//    }
//}

//    companion object Asd {
//        val a = 10
//        fun demo() : String {
//            print("from demo")
//        }
//    }

