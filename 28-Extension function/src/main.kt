fun main() {
    fun Student?.sayHello(name: String) {
        if (this != null) {
            println("Hello $name, my name is ${this.name} and age ${this.age}")
        }
    }

    val ucup = Student("Ucup", 18)
    ucup.sayHello("otong")

    val otong = null
    otong.sayHello("lupa")
}