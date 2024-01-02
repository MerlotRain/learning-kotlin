import kotlin.math.PI
import kotlin.IllegalArgumentException

fun areaOfCircle(radius:Double) = when {
    radius > 0 -> radius * radius * PI
    else -> IllegalArgumentException("error input")
}

fun main() {
    println(areaOfCircle(-1.0))
}