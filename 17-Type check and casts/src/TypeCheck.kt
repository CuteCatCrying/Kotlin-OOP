class Laptop(val name: String)
class Computer(val name: String)

fun main() {
    printObject(Laptop("Toshiba"))
    printObject(Computer("Asus"))

    printString("Alvin")
    printStringSafe(2)
}

fun printObject(any: Any) {
//    if (any is Laptop) {
//        println("Laptop name = ${any.name}")
//    } else if (any is Computer) {
//        println("Computer name = ${any.name}")
//    } else {
//        println(any)
//    }

    when (any) {
        is Laptop -> println("Laptop name = ${any.name}")
        is Computer -> println("Computer name = ${any.name}")
        else -> println(any)
    }
}

fun printString(any: Any) {
    // unsafe case
    val result = any as String
    println(result)
}

fun printStringSafe(any: Any) {
    // safe case nullable
    val result2 = any as? String
    println(result2)
}