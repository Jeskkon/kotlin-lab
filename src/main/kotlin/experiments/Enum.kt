package main.experiments

fun replicas(env:String):Int{
    return when(env){
        "dev" -> 1
        "staging" -> 2
        "prod" -> 3
        else -> error("$env not recognized")
    }
}
fun needsApproval(env: String):Boolean{
    return if (env == "prod") true else false
}

enum class Environment(
    val replicas: Int,
    val needsApproval: Boolean,
){
    DEV(1,false),
    STAGING(2,false),
    PROD(3,true),
}

fun main(){
    println("value ${replicas("dev")}") // without enum
    println("value ${Environment.PROD}") // with enum
}