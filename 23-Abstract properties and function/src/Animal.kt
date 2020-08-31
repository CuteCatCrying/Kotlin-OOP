abstract class Animal {
    abstract val name: String
    abstract fun run()
}

class Cat(override val name: String = "Cat") : Animal() {
    override fun run() {
        println("Seekor kucing $name berlari")
    }
}

class Dog : Animal() {
    override val name: String = "Dog"
    override fun run() {
        println("Seekor anjing $name berlari")
    }
}