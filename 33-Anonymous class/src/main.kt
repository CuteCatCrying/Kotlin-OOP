fun fireAction(action: Action) {
    action.action()
}

fun main() {
    fireAction(object : Action {
        override fun action() = println("Action 1")
    })

    fireAction(object : Action {
        override fun action() = println("Action 2")
    })
}