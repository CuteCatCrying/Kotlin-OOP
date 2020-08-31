interface Interaction {
    val name: String
    fun sayHello(name: String)

    // Concrete function
    fun sayHello2(name: String) {
        println("(sayHello2) Hello $name, my name is ${this.name}")
    }
}

interface Go : Interaction {
    fun go() {
        println("$name go")
    }
}

interface MoveA {
    fun move() {
        println("Move A")
    }
}

interface MoveB {
    fun move() {
        println("Move B")
    }
}

class Human(override val name: String) : Interaction, Go, MoveA, MoveB {
    override fun sayHello(name: String) {
        println("(sayHello) Hello $name, my name is ${this.name}")
    }

    override fun move() {
        super<MoveA>.move()
        super<MoveB>.move()

        println("Move human")
    }
}

class Animal(override val name: String) : Interaction {
    override fun sayHello(name: String) {
        println("(sayHello) Hello $name, my name is ${this.name}")
    }
}