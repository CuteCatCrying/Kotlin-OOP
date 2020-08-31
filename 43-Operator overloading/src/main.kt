fun main() {
    val fruit1 = Fruit(40)
    val fruit2 = Fruit(60)
    val fruit3 = fruit1 + fruit2

    println(fruit3)
    println(fruit3 - Fruit(60))
}