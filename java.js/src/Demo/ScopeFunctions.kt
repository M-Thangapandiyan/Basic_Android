package Demo

//    data class Person(var name: String, var age: Int)
//    fun main() {
//        val person = Person("Alice", 30).also { p ->
//            println("Creating person: $p")
//            p.age += 1
//        }
//        println("Modified person: $person")
//    }
data class Person(var name: String = "Hello", var age: Int = 0, var city: String = "")

fun main() {
    val person = Person()
    with(person) {
        name = "world"
        age = 30
        city = "chennai"
        this
    }
    with(person){
        age += 5
    }
    println("Created person: $person")
    person.also {
        it.name = "he"
        it.city = "chennai"
    }
    person.run {
        name = "name1"
        age = 25
    }
    person.apply {
        age = 29
    }
    println(person)
}


//fun main() {
//    val person = Person()
//    val modifiedPerson = person.apply {
//        name = ""
//        age = 30
//        city = "New York"
//    }
//    println("Created person: $modifiedPerson")
//}

//fun main() {
//    val person = Person()
//
//    val modifiedPerson = person.run {
//        name = ""
//        age = 30
//        city = "New York"
//        this
//    }
//    println("Created person: $modifiedPerson")
//}

//class Address(val street: String?)
//class Role(val role: String?)
//class Person(val name: String?, val address: Address?, val role: Role)
//
//fun getStreetName(person: Person?): String? {
//    return person?.address?.street
//}
//
//fun getRole(person : Person?): String? {
//    return person?.role?.role
//}
//
//fun main() {
//    val person1 = Person("John Doe", Address("Main Street"), Role(null))
//    val person2: Person? = null
//
//    println("Person 1 Street: ${getStreetName(person1)}")
//    println("Person 2 Street: ${getStreetName(person2)}")
//    println(getRole(person1))
//}





