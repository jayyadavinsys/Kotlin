package scopeFunctions

import basics.add

class Employee {
    var id: Int = 0
    var name: String = ""


}

fun main() {
    var emp = Employee()
    emp.id = 1
    emp.name = "Jay"
    println(emp.toString())

    var emp1 = Employee()
//Apply
    // object refrance this
    //return type is context object
    var x = emp1.apply {
        id = 2
        name = "Ram"
    }
    println(emp1.name)

    //Let
    //object Refrance it
    // return type is lambda result

    var emp2: Employee? = null
    emp2?.let {
        println(it.id)
    }
    emp2 = Employee()

    emp2?.let {
        println(it.id)
    }

    //With
     // object refrance this
    // return type is context object

    with(emp1) {
        this.name = "Kanpur"
    }

    // Run
     //object refrance this
    // return type lambda result

    emp1.run {
        println(this.name)
    }

    // Also
     // object refrance it
     // return type contet object

    emp1.also {
        println("this is also ${it.name}")
    }




}

