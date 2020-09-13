package com.asuraiv.kotlinpractice.convention

// 'in' 관례 구현

data class Rectangle(val upperLeft: Point, val lowerRight: Point)

operator fun Rectangle.contains(p: Point): Boolean {
    return p.x in upperLeft.x until lowerRight.x &&
        p.y in upperLeft.y until lowerRight.y
}

fun main() {

    val rect = Rectangle(Point(10, 20), Point(50, 50))

    println(Point(20, 30) in rect) // true
}