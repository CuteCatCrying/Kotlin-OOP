fun main() {
    val product = Product("Indomie", 2_500, "Food")
    println(product)

    val product2 = product.copy(name = "Mie Sedap");
    println(product2)
}