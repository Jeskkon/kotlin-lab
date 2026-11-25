package main.experiments.trash

fun findUser(id:Int):String?{
    return when(id){
        1 -> "admin"
        2 -> "guest"
        else -> null
    }
}

fun main(){
    val found = findUser(1)
    val missing = findUser(99)

    println(found?.length ?: -1)
    println(missing?.length ?: -1)

    found?.let { println("Found: $it") }
    missing?.let { println("Found: $it") }

    val name = requireNotNull(findUser(1)){"User 1 must exist"}
}