import kotlin.math.PI
import kotlin.IllegalArgumentException

fun areaOfCircle(radius:Double) = when {
    radius > 0 -> radius * radius * PI
    else -> IllegalArgumentException("error input")
}

fun methodResponse(msg:String, code:Int) {
    println("msg:$msg, code:$code")
}
fun main() {
    //println(areaOfCircle(-1.0))
    login("hell", "word") {
        msg:String,code:Int ->
            println("msg=$msg, code=$code")
    }


    // 函数引用
    login("hello", "world", ::methodResponse)
}

const val USR_NAME = "root"
const val USR_PWD = "123456"

// 作为函数的最后一个参数，可以放在外面去写
fun login(name:String, pwd:String, response:(String,Int)->Unit) {
    response("error", 444)
}