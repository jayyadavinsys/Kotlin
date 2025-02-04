package lambdasexpression

fun main(){
    var lamFun= { a:Int, b:Int-> a+b}
    println(lamFun(5,9))

    var st= {msg:String ->
        println("this is multi line of lam fun")
        println("you revice thwe massage : $msg")
    }

    println(st("Hello my Name is Jay Yadav"))

    var lamfun1:(Int, Int) -> Int= {a,b -> a-b}
    println(lamfun1(10, 4))

    // when we have only one argument in lambdas express than we can acces it by IT keyword like

    var sqrt:(Int)->Int={it -> it*it
    }
    println(sqrt(25))


    //Higher Order Function Using Lambdas Expression

    arthmatic(5,4,{x, y-> x+y})
}

fun arthmatic(a:Int, b:Int, fn:(Int, Int)->Int){
    var result= fn(a,b)
    println(result)
}