open class Shape {
    open val corner: Int = -1
}

class Rectangle : Shape() {
    override val corner = 4
    val superCorner: Int = super.corner
}

class Triangle : Shape() {
    override val corner = 3
    val superCorner: Int = super.corner
}
