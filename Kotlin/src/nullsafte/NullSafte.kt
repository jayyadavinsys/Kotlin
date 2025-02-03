package nullsafte

import org.w3c.dom.Node


class NullSafte {

//    Check for null with the if conditional
//
//    Safe call operator ?.
//
//    Elvis operator ?:
//
//    Not-null assertion operator !!
//
//    Nullable receiver
//
//    let function
//
//    Safe casts as?
//
//    Collections of a nullable type



}fun main() {
    // Assigns a non-null string to a variable
    var a: String = "abc"
    // Attempts to re-assign null to the non-nullable variable
   // a = null
    println(a)
    // Null can not be a value of a non-null type String

// Returns the length of a non-nullable variable
    var l = a.length
    println(l)


    // Assigns a nullable string to a variable
    var b: String? = "abc"
    // Successfully re-assigns null to the nullable variable
    b = null
    println(b)
    // null

    // Tries to directly return the length of a nullable variable
  // val k = b.length
   // print(k)
    // Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
    println(a?.length)
    // 6
    println(b?.length)

    b = null
    // Checks for nullability. If not null, returns length. If null, returns a non-null value
     l = b?.length ?: 0
    println(l)

    b = "Kotlin"
// Treats b as non-null and accesses its length
     l = b!!.length
    println(l)

    //let function

    // Declares a list of nullable strings
    val listWithNulls: List<String?> = listOf("Kotlin", null)

    // Iterates over each item in the list
    for (item in listWithNulls) {
        // Checks if the item is null and only prints non-null values
        item?.let {
            println(it)
        }
        //Kotlin
    }

    //filterNotNull method

    // Declares a list containing some null and non-null integer values
    val nullableList: List<Int?> = listOf(1, 2, null, 4)

    // Filters out null values, resulting in a list of non-null integers
    val intList: List<Int> = nullableList.filterNotNull()

    println(intList)
    // [1, 2, 4]

    //as Operator

    // Declares a variable of type Any, which can hold any type of value
    a = "Hello, Kotlin!"

    // Safe casts to Int using the 'as?' operator
    val aInt: Int? = a as? Int
    // Safe casts to String using the 'as?' operator
    val aString: String? = a as? String

    println(aInt)
    // null
    println(aString)
    // "Hello, Kotlin!"
}