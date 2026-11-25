package main.experiments.trash

fun statusText(code: Int): String = when (code) {
    200 -> "OK"
    201 -> "Created"
    301,302 -> "Redirect"
    in 400..499 -> "Client error"
    in 500..599 -> "Server error"
    else -> "Unknown"
}

fun describe(x:Any):String = when(x) {
    is Int -> "Int: $x"
    is String -> "String of length ${x.length}"
    is Boolean -> "Boolean: $x"
    else -> "Unknown type"
}

fun grade(score:Int): String = when{
    score >= 90 -> "A"
    score >= 75 -> "B"
    score >= 50 -> "C"
    else -> "F"
}
fun main(){
    println(statusText(200))
    println(statusText(302))
    println(statusText(404))
    println(statusText(503))
    println(statusText(100))

    println(describe(42))
    println(describe("kotlin"))
    println(describe(true))
    println(describe(3.14))

    println(grade(95))
    println(grade(80))
    println(grade(60))
    println(grade(10))
}