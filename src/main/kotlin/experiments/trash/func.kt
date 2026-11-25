package main.experiments.trash

fun buildUrl(host:String, port: Int = 80, path:String = "/"): String{
    require(isPortValid(port)) { "Port must be between 1 and 65535" }
    return  "http://$host:$port$path"
}
fun isPortValid(port: Int) = port in 1..65535

fun main(){
    println(buildUrl(host = "example.com", port = 123, path = "/"))
    println(buildUrl("example.com", 90, "/nowhere"))
    println(buildUrl("google.com", path = "/somewhere/in/internals"))
    println(buildUrl("claude.ai"))

    println(isPortValid(41241))
    println(isPortValid(412411))
    println(isPortValid(441))
}