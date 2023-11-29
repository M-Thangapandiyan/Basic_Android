package Demo

data class Employee(var name: String?, var profession: String?)

val employees = mutableListOf<Employee>()

    fun createEmployee(name: String?, profession: String?) {
        val employee = Employee(name,profession)
        employee.let {
            employees.add(employee)
            println("Employee $name created successfully with profession $profession")
        }

    }

    fun updateEmployee() {
            println("Enter the name to update")
            val updateName = readString()
            val e = employees.find { item -> item.equals(updateName)}
            println("Enter the name to profession")
            val updateProfession = readString()
            e?.apply {
                e.profession = updateProfession ?: e.profession
            }
            println("Employee $updateName updated successfully with new name $e")
    }

    fun deleteEmployee() {
        println("Enter the name")
        val name: String? = readString()
        name.let {
            val e = employees.find { item -> item.equals(name)}
            employees.remove(e)
            println("employee $name is removed")
        }
    }

    fun getEmployee() {
      println(employees)
    }

fun readString() : String? {
    return readLine()
}


fun main() {

    while (true) {
        println("Choose an option:")
        println("1. Create Employee")
        println("2. Update Employee")
        println("3. Delete Employee")
        println("4. Get Employee Details")
        println("5. Exit")
        val choice = Integer.valueOf(readLine())
        when (choice) {
            1 -> {
                println("Enter the name")
                val name: String? = readString()
                println("Enter the profession")
                val profession: String? = readString()
                createEmployee(name, profession)
            }
            2 -> updateEmployee()
            3 -> deleteEmployee()
            4 -> getEmployee()
            5 ->run {
              println("exited")
                return
           }
//            5 -> {
//                println("Exiting program...")
//                break
//            }
        }

    }
}
