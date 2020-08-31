import data.User

fun main() {
    val user = User("alvin", "abc123")

    println(user.userName)
    println(user.password)

    user.userName = "alvindiganti"

    println(user.userName)
    println(user.password)
}