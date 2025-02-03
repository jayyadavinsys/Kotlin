package thiskeyword

//To denote the current receiver, you use this expressions:
//
//In a member of a class, this refers to the current object of that class.
//
//In an extension function or a function literal with receiver this denotes the receiver parameter that is passed on the left-hand side of a dot.
//
//If this has no qualifiers, it refers to the innermost enclosing scope. To refer to this in other scopes, label qualifiers are used:
//

class thisKeyword {
}

fun main() {
    fun printLine() { println("Local function") }

    class A {
        fun printLine() { println("Member function") }

        fun invokePrintLine(omitThis: Boolean = false)  {
            if (omitThis) printLine()
            else this.printLine()
        }
    }

    A().invokePrintLine() // Member function
    A().invokePrintLine(omitThis = true) // Local function
}