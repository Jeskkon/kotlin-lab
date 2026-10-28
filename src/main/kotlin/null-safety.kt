package main

fun main(){
    //?. - safe call -----------------------------
    val a: String? = null
    println(a?.length)

    //equal to

    val b: String? = null
    if (b == null){
        println(null)
    }
    else{
        print(b.length)
    }

    //?: elvis operator --------------------------
    val c: String? = null
    var d = c?.length ?: "0"
    println(d)

    //equal to

    if (c == null){
        d = 0
    }
    else{
        print(c.length)
    }

    //!!. not-null assertion --------------------
    val e: String? = null
    println(e!!.length) //NPE

    //equal to

    val f: String? = null
    if (e == null){
        throw NullPointerException()
    }
    else{
        print(e.length)
    }
}