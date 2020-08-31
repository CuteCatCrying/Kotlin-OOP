class Manager(name: String) : Employee(name) {
    override fun sayHello(name: String) {
        println("Kelas manager -> (Hello $name, my name is ${this.name})")
    }
}