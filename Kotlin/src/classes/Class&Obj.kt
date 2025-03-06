package classes

class ClassandObj {

    var name:String="Jay"
    var age: Int=23
    var gender:String="Male"
    var occupation :String="Software Engineer"

    fun work(){
        println("$name is $occupation")
    }
    fun getAge(){
        println("Age is $age")
    }
    fun getGender(){
        println("Gender is $gender")
    }
}
class Employee(var name:String, var age:Int, var job:String){
    lateinit var a:String

    init {
        a = "Krishan"

        a = "Jay"
    }

}
fun main(){
    var obj1=ClassandObj();
    println(obj1.work())
    var emp1=Employee("Jay", 23, "SWE")
    println(emp1.name)
}