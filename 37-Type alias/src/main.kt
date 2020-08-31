typealias App = Application
typealias Aplikasi = App
typealias StringSupplier = () -> String

fun sayHello(supplier: StringSupplier) {
    println("Hello ${supplier()}")
}

fun main() {
    val app = App("Kotlin App")
    val aplikasi = Aplikasi("Java App")

    println(app.name)
    println(aplikasi.name)

    sayHello { "Alvin" }
}