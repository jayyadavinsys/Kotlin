package scopeFunctions

data class Example( var name: String,var age:Int, var city: String) {

    fun moveTo(city: String){
        this.city=city
    }
    fun incAge(){
    this.age++ }

}
fun main(){
    Example("Jay", 24, "Noida").let {
        println(it)
        it.incAge()

        it.moveTo("Pune")
        println(it)
    }
}
