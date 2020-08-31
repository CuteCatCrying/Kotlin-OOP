class Student(
    var firstName: String,
    var lastName: String = ""
) {
    fun sayHello(name: String) {
        println("Hello $name, my name is $firstName")
    }

    fun getFullName(): String {
        return "$firstName $lastName"
    }
}