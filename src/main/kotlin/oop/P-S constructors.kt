package main.OOP
//primary
//every class have primary constructor, even empty classes.
class Example // EMPTY primary constructor

class Person ( //from this bracket
    val name: String,
    val age: Int
) //to this bracket. This is constructor

class Person2 constructor(
    val name: String,
    val age: Int
)
//class Person & Person2 are equal. primary constructor is used with annotations.
// using annotations without keyword constructor(*) is not possible
class Person3 @JvmOverloads constructor(val name:String)
// class Person4 @JvmOverloads (val name:String) // <--- as shown here, uncomment for error

//secondary
class AvgSpeed(
    val distance: Int,
    val time: Int, //in seconds
){
    //secondary constructor
    constructor(data: String) : this(
        data.split(":")[0].toInt(), // don't forget ,
        data.split(":")[1].toInt()
    )

    fun showData(){
        println("distance = ${distance}m, time = ${time}s, avg = ${distance / time.toFloat()}m/s")
    }
}

fun main(args: Array<String>) {
    val a = AvgSpeed(15,20)
    val b = AvgSpeed("12:30")
    a.showData()
    b.showData()
}