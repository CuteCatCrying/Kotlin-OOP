fun main() {
    fun operation(value1: Int, value2: Int, operation: Operation): Int {
        return when (operation) {
            is Plus -> value1 + value2
            is Minus -> value1 - value2
            is Modulo -> value1 % value2
        }
    }

    println(operation(4, 5, Plus()))
    println(operation(6, 2, Minus()))
    println(operation(9, 5, Modulo()))
}