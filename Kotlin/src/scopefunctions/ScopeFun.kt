package scopefunctions

class Employee{
    var id:Int=0
    var name:String=""
}

fun main(){
var emp= Employee()
    emp.id=1
    emp.name= "Jay"
    println(emp.toString())

    var emp1= Employee()
//Apply
  var x  =emp1.apply {
        id=2
        name="Ram"
    }
    println(emp1.name)

    //Let

    var emp2:Employee?=null
    emp2?.let {
        println(it.id)
    }
    emp2=Employee()

    emp2?.let {
        println(it.id)
    }

    //With

    with(emp1){
        this.name="Kanpur"
    }

    // Run

    emp1.run {
        println(this.name)
    }

    // Also

    emp1.also {
        println("this is also ${it.name}")
    }

}