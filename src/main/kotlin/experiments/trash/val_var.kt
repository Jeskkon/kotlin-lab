package main.experiments

fun main(){
    val serviceName: String = "auth-service"
    val port: Int = 8080
    var counter = 0

    counter += 3

    println("Service $serviceName running on port $port, requests: $counter")
    val timeout: Double = 2.5
    println("timeout in ms: ${timeout*1000}")
}