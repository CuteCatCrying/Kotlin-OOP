fun main() {
    val shape = Shape()
    println(shape.corner)

    val shape2 = Rectangle()
    println(shape2.corner)
    println(shape2.superCorner)

    val shape3 = Triangle()
    println(shape3.corner)
    println(shape3.superCorner)
}