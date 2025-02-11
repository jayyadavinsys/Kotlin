package highOrderFun

fun main(){
    var sq=::seq
    println("Square of 8 is : ${sq(8)}")

    //High Order fun is calling
    arthemicOper(50,30, ::add)
    arthemicOper(90 , 23, ::sub)
    arthemicOper(25 , 5, ::mult)
    arthemicOper(1500, 30, ::dive)
}

fun seq(a :Int): Int{
    var res:Int=a*a;
    return res
}

fun add(a:Int, b:Int):Int {
    return a + b

}
fun sub(a:Int, b:Int):Int {
    return a - b
}


fun mult(a:Int, b:Int):Int{
    return  a*b
}
fun dive(a:Int, b:Int):Int{
    return  a/b
}

fun arthemicOper(a:Int, b:Int, fn:(Int ,Int)->Int){
    var result= fn(a,b)
    println(result)
}