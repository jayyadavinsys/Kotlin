package scopefunctions

class ScopeFunctions {
}

class MultiportService(var url: String, var port: Int) {
    fun prepareRequest(): String = "Default request"
    fun query(request: String): String = "Result for query '$request'"
}

data class Person(var name: String, var age: Int, var city: String) {
    fun moveTo(newCity: String) { city = newCity }
    fun incrementAge() { age++ }
}

data class Persons(var name: String, var age: Int = 0, var city: String = "")



fun main() {
    Person("Alice", 20, "Amsterdam").let {
        println(it)
        it.moveTo("London")
        it.incrementAge()
        println(it)
    }


    //let() functions


    var number = mutableListOf("one", "two", "three", "four", "five")
    number.map { it.length }.filter { it > 3 }.let {
        println(it)
        // and more function calls if needed
    }



    val numbers = listOf("one", "two", "three", "four")
    val modifiedFirstItem = numbers.first().let { firstItem ->
        println("The first item of the list is '$firstItem'")
        if (firstItem.length >= 5) firstItem else "!" + firstItem + "!"
    }.uppercase()
    println("First item after modifications: '$modifiedFirstItem'")


    //run

    val service = MultiportService("https://example.kotlinlang.org", 80)

    val result = service.run {
        port = 8080
        query(prepareRequest() + " to port $port")
    }

    // the same code written with let() function:
    val letResult = service.let {
        it.port = 8080
        it.query(it.prepareRequest() + " to port ${it.port}")
    }
    println(result)
    println(letResult)


    //apply

    val adam = Persons("Adam").apply {
        age = 32
        city = "London"
    }
    println(adam)


    //also

    var no = mutableListOf("one", "two", "three")
    no
        .also { println("The list elements before adding new one: $it") }
        .add("four")
}