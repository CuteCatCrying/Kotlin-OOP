class Person {
    var firstName: String = ""
    var middleName: String? = null
    var lastName: String = ""
}

fun main() {
    val alvin = Person()
    alvin.firstName = "Zukron"
    alvin.lastName = "Rahmadhan"

    println("Object $alvin dengan nama = ${alvin.firstName} ${alvin.middleName} ${alvin.lastName}")
}