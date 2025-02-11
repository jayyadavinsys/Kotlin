package classes


//The primary constructor must have at least one parameter.
//All primary constructor parameters must be marked as val or var.
//Data classes can't be abstract, open, sealed, or inner.
// Data classes are immutable in nature and the variable are allow var and val.
// var is also final so we not change the value.
//Providing explicit implementations for the componentN() and copy() functions  allowed.

data class User(var name: String, val age: Int){

}
fun main(){

    val p1= User("Jay", 24)
    val p2= User ("Ram", 26)
    val p3= p1.copy();
    println(p1)
    println(p2)
    println(p3)
    println(p1==p3)
    println(p1==p2)
    print(p1.equals(p2))
}
