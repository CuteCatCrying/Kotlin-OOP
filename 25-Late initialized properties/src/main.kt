fun main() {
    val television = Television()
    //println(television.brand) // error UninitializedPropertyAccessException

    television.initTelevision("Asus")
    println(television.brand)
}