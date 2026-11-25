package main.experiments.trash

fun main(){
    val services = listOf("auth", "billing", "gateway", "cache", "db", "notifications")

    println(services.filter{it.length > 4})

    println(services.map{it.uppercase()})

    println(services.filter{it.length > 4}.map{"$it-service"})

    val ports = mapOf("auth" to 8081, "billing" to 8082, "gateway" to 8080)

    for(service in services){
        println("$service: ${ports[service] ?: "no port"}")
    }
}