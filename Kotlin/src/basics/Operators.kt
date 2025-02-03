package basics

fun main(){

    // Arithmetic Operators

    var a= 50
    var b=30

    println("sum of a and b is ${a+b}")
    println("differnce of a and b is ${a-b}")
     println("product of a and b is ${a*b}")
    println("division of a and b is ${a/b}")

    // Assignment Operators

    var c=75
    println(c)
    c+=1
    println(c)
    c-=1
    println(c)

    c*=2
    println(c)

    c/=3
    println(c)

    c%=3

    println(c)

    //Relational Operators

    //greater than

    if(a>b) println(" $a is greater than $b  ")

    //smaller than
    if(c<a) println(" $c is smaller than $a")

    a= 50
    b=50
    // greater than equals
    if(a>=b) println(" $a is greater or equals to $b")

    // smaller than equals

    if(a<=b) println(" $a id smaller or equals to $b")

    // equals to operator
    if(a==b) println(" $a is equals to $b")

    //not equals operator

    if(a!=c) println(" $a is not equals to $c")


}