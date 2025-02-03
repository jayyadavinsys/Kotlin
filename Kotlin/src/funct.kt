class funct {

    fun<T> asList(vararg ts: T):List<T>{
        val result =ArrayList<T>()
        for(t in ts){
            result.add(t)

        }
        return result;
    }

    fun decimal(a :Int, b: Int): Int{

       println( findFixPoint())
        return a*b
    }

    val eps = 1E-10
    private  fun findFixPoint(): Double{
        var x=1.0
        while(true){
            val y=Math.cos(x)
            if(Math.abs(x-y)<eps) return x
            x=Math.cos(x)
        }
    }
}
fun main(){
    val fu=funct();
    println(fu.asList(45, 24, 55, 4,3,2,))
    println(fu.decimal(50,23))
}