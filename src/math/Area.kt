package math

import kotlin.IllegalArgumentException
import kotlin.math.PI
import kotlin.math.pow

fun areaOfCircle(radius: Double) = when {
    radius > 0 -> radius.pow(2) * PI
    else -> throw IllegalArgumentException("Radius must be positive")
}

fun areaOfRectangle(width: Double, height: Double) {
    when {
        width > 0 && height > 0 -> width * height
        else -> throw IllegalArgumentException("Length and Width must be positive")
    }
}

fun areaOfSquare(side: Double) {
    when {
        side > 0 -> side.pow(2)
        else -> throw IllegalArgumentException("Side Length must be positive")
    }
}