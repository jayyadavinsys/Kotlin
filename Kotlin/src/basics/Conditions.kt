package basics

fun main(){
    var a=20

    var b=30

    if(a>b){
        println("a is greater than b")
    }else {
        println(" b is greater than a")
    }

    println(if(a>b) a else b)

    var c= if(a>b) a else b;

    println(" c is $c")


    var mark=35

    var grad= if(mark>=75) "Excilant" else if(mark<75 && mark>=45) "Good" else "Poor"

    println(grad)
}