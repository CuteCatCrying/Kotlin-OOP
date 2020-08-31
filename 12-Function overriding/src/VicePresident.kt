open class VicePresident(name: String) : Employee(name) {
    final override fun sayHello(name: String) {
        println("Kelas Vice President -> (Hello $name, my name is ${this.name})")
    }
}