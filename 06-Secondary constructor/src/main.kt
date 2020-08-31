import data.Address
import data.Car

fun main() {
    // Car
    val yaris = Car("Toyota", "Yaris")
    val avanza = Car("Toyota")

    println(yaris.name)
    println(avanza.brand)

    // Address
    val address1 = Address("Angin", "Bandung")
    val address2 = Address("Awan", "Bekasi", "Amerika")
    println(address1.city)
    println(address1.country)

    println(address2.street)
    println(address2.country)
}