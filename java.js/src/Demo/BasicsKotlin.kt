package Demo

//import java.util.Random
//
//class Array{
//    var s = arrayOf("1",2,3.0)
//}
//fun main() {
//    var s1 = Array()
//    println(s1.s[2])
//    for(x in s1.s){
//        println(x)
//    }
//}
//
// when example program
//fun main() {
//    feedTheFish()
//}
//
//fun feedTheFish() {
//    val day = randomDay()
//    var food = feedthefood(day)
//    println ("Today is $day and the fish eat $food")
//    val day = "Monday"
//    var f = fe(day)
//    println(fe(day))
//}
//
//fun randomDay() : String {
//    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
//            "Friday", "Saturday", "Sunday")
//
//    println("nextint" + week[Random().nextInt(week.size)])
//    return week[Random().nextInt(week.size)]
//}
//
//fun feedthefood(day : String) : String {
//    var food : String
//  when(day) {
//        "Monday" -> food = "seed"
//        "Wednesday" -> food =  "redworms"
//        "Thursday" -> food = "granules"
//        "Friday" -> food = "mosquitoes"
//        "Sunday" -> food = "plankton"
//        else -> food ="nothing"
//    }
//    return food
//}
//
// short version
//fun fe(day : String) : String {
//    var dayIHave = day
//    return when {
//         (dayIHave=="Monday") -> "seed"
//         (dayIHave == "Saturday" )-> "redworms"
//        "Thursday" -> "granules"
//        "Friday" ->"mosquitoes"
//        "Sunday" -> "plankton"
//        else -> "nothing"
//    }
//}
//
//
//fun main() {
//    swim()
//    println("istoHot : ${hello(20)}")
//}
//
//fun swim(speed : String = "fast") {
//    println("swimming $speed")
//}
//
//fun isto0Hot(tempareture : Int) = tempareture > 30
//
//fun hello(temperature: Int = 22) {
//
//}



//val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
//
//fun main() {
//    println( decorations. filter {it.startsWith("ro")})
//}

//scope function(with,apply)

//class Person(var name: String, var age: Int)
//
//fun main() {
//    val person = Person("Alice", 30)
//    val person1 = Person("Al", 10)
//
//    val result: String = with(person) {
//        name = "Bob"
//        "Updated name: $name"
//    }
//
//    println(result)
//    val resultPerson1 = with(person1) {
//        name = "Alice"
//        "Updated name: $name"
//    }
//
////    val resultPerson1 = person1.apply {
////        name = "Alex"
////        age = 20
////    }
//
//
//    println("Updated name in person1: ${resultPerson1.name}")
////    println("Updated age in person1: ${resultPerson1.age}")
//}

//filters(asSequance())

//fun main() {
//    val decorations = mutableListOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
//
//     decorations.filter { it[0] == 'p' }.map { println("hello = " + it)}.toList()
    // eager, creates a new list
//    val eager = decorations.filter { it[0] == 'p' }
//    println("eager: $eager")
//
//    // lazy, will wait until asked to evaluate
//    val filtered = decorations.asSequence().filter { it[0] == 'p' }
//    println("filtered: $filtered")
//
//    // force evaluation of the lazy list
//    val newList = filtered.toList()
//    println("new list: $newList")
//
//
//    val lazyMap = decorations.asSequence().map {
//        println("access: $it")
//        it
//    }
//
//    println("lazy: $lazyMap")
//    println("-----")
//    println("first: ${lazyMap.first()}")
//    println("-----")
//    println("all: ${lazyMap.toList()}")

//    val lazyMap2 = decorations.asSequence().filter {it[0] == 'p'}.map {println("access: $it")
//        it}
//    println("filtered: ${lazyMap2.toList()}")
//}

//example for create class

//class Aquarium {
//    var len: Int= 20
//    var height : Int = 30
//
//    fun printSize() {
//        println("Length: $len cm " +
//                "Height: $height cm ")
//    }
//}
//
//fun buildAquarium() {
//    var aq = Aquarium()
//    aq.printSize()
//    aq.height = 20
//    aq.printSize()
//}
//
//
//fun main() {
//    buildAquarium()
//}


//example for create  class with constructor

//class Aquarium (len: Int = 20 , height : Int = 30){
//var len: Int = len
//var height : Int = height
//    fun printSize() {
//        println("Length: $len cm " +
//                "Height: $height cm ")
//    }
//}
//
//fun bulidAquarium() {
//    var aquarium = Aquarium()
//    aquarium.printSize()
//    var aquarium1 = Aquarium(len = 50)
//    aquarium1.printSize()
//    var aquarium2 = Aquarium(len = 50, height = 60)
//    aquarium2.printSize()
//
//}
//
//fun main() {
//    bulidAquarium()
//}


// example for open class

//open class Animal(val species: String) {
//    open fun makeSound() {
//        println("The $species makes a generic sound.")
//    }
//}
//
//class Dog : Animal("Dog") {
//    override fun makeSound() {
//        println("The Dog barks!")
//    }
//}

//fun main() {
//    val animal = Animal("Unknown")
//    animal.makeSound()
//
//    val dog = Dog()
//    dog.makeSound()
//}

// example for open modifier ()
//open class ExampleOpenClass(val open : String) {
//
//    init {
//        println("hello world")
//    }
//    open fun openFunction(){
//        println(" $open open function")
//    }
//}
//
//class ExampleOpenClass1: ExampleOpenClass("h") {
//    override fun openFunction(){
//        println("open function")
//    }
//}
//fun main(){
//    val exampleopenclass = ExampleOpenClass("Overrided")
//    exampleopenclass.openFunction()
//
//    val exampleopenclass2 = ExampleOpenClass1()
//    exampleopenclass2.openFunction()
//}

//example for get and set function

fun main(){
    val s = VolumeCalculator(20,20,30)
    println(s.volume)
    println(s.a)
}

