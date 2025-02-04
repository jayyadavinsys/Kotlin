package basics

fun main(){
     var a=50
    var b=100
    var c="divsion"

    when(c){

        "add" -> println(" the sum of $a and $b is : ${a+b}")
        "substract" -> println(" The Differnce of $a and $b is : ${a-b}")
        "product"  -> println(" the Product of $a and $b is : ${a*b}" )
        "divsion" -> println(" the div of $a and $b is : ${a/b}")

        else -> println("wrong operation")
    }
    when(a){
         in 30..200 -> println("Yes this no. persent inside the range")
    }

}