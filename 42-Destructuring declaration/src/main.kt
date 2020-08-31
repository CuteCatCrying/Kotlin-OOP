fun minMax(value1: Int, value2: Int): MinMax {
    return when {
        value1 > value2 -> MinMax(value2, value1)
        else -> MinMax(value1, value2)
    }
}

fun login(login: Login, callback: (Login) -> Boolean): Boolean {
    return callback(login)
}

fun main() {
    val game = Game("Zelda", 20_000)
    val (name, price) = game
    println(name)
    println(price)

    val (min, _) = minMax(80, 8)
    println(min)
//    println(max)

    val login = Login("User", "123")
//    login(login){login ->
//        login.user == "alvin" && login.password == "1234"
//    }
    login(login) { (user, password) ->
        user == "alvin" && password == "123"
    }
}