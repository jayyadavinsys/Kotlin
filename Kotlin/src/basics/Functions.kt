package basics

fun main(){
    var a=10
    var b=20
    println(add(a,b))
    var add=::addition
    println(add(5,6))
}
fun add(a:Int, b:Int) : Int{
    return a+b
}

fun addition(a:Int , b:Int ): Int{
    return a+b;
}