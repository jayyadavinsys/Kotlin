package classes

data class User(val name: String, val age: Int){

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
