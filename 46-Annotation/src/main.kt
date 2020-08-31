@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Fancy(val author: String)

@Fancy(author = "Alvin")
class MyApplication(val name: String, val version: Int) {
    fun info(): String = "Application $name-$version"
}

fun main() {
    val myApplication = MyApplication("Kotlin App", 1)
    println(myApplication.info())
}