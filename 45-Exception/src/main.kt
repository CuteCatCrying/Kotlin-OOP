import java.lang.NullPointerException

class ValidationException(message: String) : Throwable(message)

fun validateAndSayHello(name: String) {
    if (name.isBlank()) {
        throw ValidationException("Name is blank")
    } else {
        println("Hello $name")
    }
}

fun main() {
    try {
        validateAndSayHello("Alvin")
        validateAndSayHello("")
    } catch (e: ValidationException) {
        println("Terjadi error ${e.message}")
    } catch (e: Throwable) {
        println("Terjadi error ${e.message}")
    } finally {
        println("finally always be executed what ever if try success or not")
    }
}