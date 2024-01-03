@file:Suppress("UNREACHABLE_CODE")

fun main() {
    var name:String? = "hello,world";
    println(name?.uppercase()) // 来自C#的一种写法

    //name = null
    println(name!!.toString()) // 无法执行，因为为null时，必然崩溃，另一个问题时，因为有两个uppercase函数
    // 如果为null，就不知道用哪个了，因为这里允许为null,

    var password: String? = "123456"
    if(password!= null) {
        println(password.uppercase())
    }

    println(password?.map { "[$it]" })

    checkNotNull(password)

    password.forEach { ch -> println("$ch ") }
}