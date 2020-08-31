class Person(
    firstNameParam: String,
    middleNameParam: String?,
    lastNameParam: String = ""
) {
    var firstName: String = firstNameParam
    var middleName: String? = middleNameParam
    var lastName: String = lastNameParam
}

fun main() {
    val alvin = Person("Zukron", null)

    println("${alvin.firstName} ${alvin.middleName} ${alvin.lastName}")
}