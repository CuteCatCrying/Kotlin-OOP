class Boss(val name: String) {
    inner class Employee(val name: String) {
        fun hai() {
            println("My name is $name and my boss name is ${this@Boss.name}")
        }
    }
}