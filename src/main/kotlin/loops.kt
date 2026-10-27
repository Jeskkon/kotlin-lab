package main

fun main(){
    for(i in 1..10){
        println("step #$i")
    }

    var i = 1
    println("another loop")
    while(true) {
        if (i>10){
            break
        }
        println("step #$i")
        i++
    }

    val list = listOf(5)
    print(list.joinToString(" "))
    list.forEach{
        print("number $it")
    }
}