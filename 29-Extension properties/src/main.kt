fun Student.sayHello(name: String) {
    println("Hello $name, my name is ${this.name} and age ${this.age}")
}

val Student.upperName: String
    get() = this.name.toUpperCase()

fun main() {
    val ucup = Student("Ucup", 18)
    ucup.sayHello("otong")

    println(ucup.upperName)
}