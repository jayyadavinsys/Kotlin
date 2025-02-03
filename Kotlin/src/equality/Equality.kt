package equality

class Equality {

}
fun main() {
    var a = "hello"
    var b = "hello"
    var c: String? = null
    var d:String?= null
    var e = d

    println(a == b)
    // true
    println(a == c)
    // false
    println(c == e)
    // true



     a = "Hello"
     b = a
     c = "world"
     d = "world"

    println(a === b)
    // true
    println(a === c)
    // false
    println(c === d)
    // true

}

class Point(val x: Int, val y: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Point) return false

        // Compares properties for structural equality
        return this.x == other.x && this.y == other.y
    }
}