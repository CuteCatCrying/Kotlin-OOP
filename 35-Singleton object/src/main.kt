fun main() {
    val name = Utilities.toUpper("Alvin")
    println(name)

    Utilities.name = "Di ubah"
    a()
    b()

    println(Application.Utilities.toUpper("alvin"))
}

fun a() {
    println(Utilities.name)
}

fun b() {
    println(Utilities.name)
}