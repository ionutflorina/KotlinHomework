package com.example.tema2

data class Rectangle(val x: Int, val y: Int, val w: Int, val h: Int)

class Paint {
    var color: Long = 0x00FF00
    var strokeWidth: Int = 5
    fun drawRectangle(rect: Rectangle) {
        println("Drawing $rect color: $color stroke: $strokeWidth")
    }
}


fun render(paint: Paint?, rectangles: List<Rectangle?>) {
    paint?.let {
        it.color = 0xFF0000
        rectangles.forEach { it1 -> it1?.let { it1 -> it.drawRectangle(it1) } }
    }
}

