package Demo
//
//
//fun main() {
////    val list = listOf(1, 3, 2, 4, 7, 5, 3)
////    val sl = list.toList()
//
//    val list1 = mutableListOf(2, 1, 3, 4, 65, 6, 7)
//    println(list1)
//
////    val set = list1.toMutableSet()
////    println("hello" + set)
////    set.forEach {
////        println(it)
////    }
//
//    val listIterato = list1.listIterator()
//    listIterato.next()
//    listIterato.add(12)
//    listIterato.next()
//    listIterato.set(122)
////    while ( listIterato.hasNext()) {
////        println(listIterato.next())
////    }
//    listIterato.forEach { println("list iterator = " + list1) }
//    }


const val POINTS_X_PASS: Int = 15
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)
val EZPassReport: Map<Int, Int> = EZPassAccounts

fun updatePointsCredit(accountId: Int) {
    if (EZPassAccounts.containsKey(accountId)) {
        println("Updating $accountId...")
        println("getValue" + EZPassAccounts.getValue(accountId) )
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS
    } else {
        println("Error: Trying to update a non-existing account (id: $accountId)")
    }
}

fun accountsReport() {
    println("EZ-Pass report:")
    EZPassReport.forEach {
            k, v -> println("ID $k: credit $v")
    }
}

fun main() {
//    accountsReport()
//    updatePointsCredit(1)
//    updatePointsCredit(1)
    updatePointsCredit(5)
//    accountsReport()
}



