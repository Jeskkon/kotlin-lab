package main.experiments

import kotlin.math.pow
import kotlin.math.sqrt

abstract class Shape(

){
    val name: String = this::class.simpleName ?: "unknown"

    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}

class Circle(
    val radius: Double
) : Shape() {
    init {
        require(radius > 0) { "radius must be positive" }
    }
    override fun calculateArea(): Double {
        return Math.PI * radius.pow(2.0)
    }
    override fun calculatePerimeter(): Double {
        return 2*Math.PI * radius
    }
}

class Triangle(
    val a: Double,
    val b: Double,
    val c: Double,
): Shape() {
    init{
        require(a > 0 && b>0 && c > 0 ){"sides must be > 0"}
        require(a+b>c && a+c>b && b+c>a ){"triangle inequality"}
    }
    override fun calculateArea(): Double {
        val p = (a+b+c)/2
        return sqrt(p*(p-a)*(p-b)*(p-c))
    }
    override fun calculatePerimeter(): Double {
        return a+b+c
    }
}

class Rectangle(
    val a: Double,
    val b: Double,
):Shape() {
    init {
        require(a > 0 && b>0){"sides must be > 0"}
    }
    override fun calculateArea(): Double {
        return a*b
    }
    override fun calculatePerimeter(): Double {
        return 2*(a+b)
    }
}

fun totalArea(shapes: List<Shape>): Double {
    return shapes.sumOf { shape -> shape.calculateArea() }
}

fun main() {
    val shapes: List<Shape> = listOf(
        Circle(2.0),
        Triangle(2.0, 2.0, 2.0),
        Rectangle(2.0,4.0),
    )

    println("totalArea: ${totalArea(shapes)}")

    for (shape in shapes){
        println(shape.name)
        println(shape.calculateArea())
        println(shape.calculatePerimeter())
    }
}