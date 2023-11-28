package Demo


fun main() {
//    val list = listOf(1, 3, 2, 4, 7, 5, 3)
//    val sl = list.toList()

    val list1 = mutableListOf(2, 1, 3, 4, 65, 6, 7)
    println(list1)

//    val set = list1.toMutableSet()
//    println("hello" + set)
//    set.forEach {
//        println(it)
//    }

    val listIterato = list1.listIterator()
    listIterato.next()
    listIterato.add(12)
    listIterato.next()
    listIterato.set(122)
//    while ( listIterato.hasNext()) {
//        println(listIterato.next())
//    }
    listIterato.forEach { println("list iterator = " + list1) }
    }