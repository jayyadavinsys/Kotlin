package extentionFunc

fun main(){
var cr=Cricle()
    println(cr.area(5))

    //extention function

    println(cr.perimeter(5))

    //pre define class funtion

    var str="NAMAAN"
   println( str.isPalindrome())
}

class  Cricle{
    fun area(r:Int):Double{
        return  3.14*r*r
    }
}

// custom class extention function
fun Cricle.perimeter(r:Int):Double{
    return 2*3.14*r
}

// predefine class extention Function

fun String.isPalindrome():Boolean{
    return this.lowercase()==this.lowercase().reversed();
}