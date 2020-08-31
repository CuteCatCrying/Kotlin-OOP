class Account {
    val name: String by lazy {
        println("name is call")
        "alvin"
    }
}