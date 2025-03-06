package functionalinterface

class KrunnableImp: Krunnable {
    override fun doSum(a: Int, b: Int) {
       println(a+b);
    }

}

fun interface IntPridect{
    fun accept(i :Int): Boolean
}

val isEven= IntPridect{it->it%2==0}

fun main(){
    println(isEven.accept(7))
}