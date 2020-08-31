import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

class ValidationException(message: String) : Throwable(message)

data class CreateProductRequest(
    @NotBlank val id: String,
    @NotBlank val name: String,
    @NotBlank val price: Long
)

data class CreateCategoryRequest(
    @NotBlank val id: String,
    @NotBlank val name: String
)

fun validateRequest(request: Any) {
    val clazz = request::class
    val properties = clazz.memberProperties

    // iterate satu satu, cek jika ada annotation not blank
    for (property in properties) {
        if (property.findAnnotation<NotBlank>() != null) {
            val value = property.call(request)
            when (value) {
                is String -> {
                    if (value == "") {
                        throw ValidationException("${property.name} is blank")
                    }
                }
            }
        }
    }
}

fun main() {
    val request = CreateProductRequest("1", "Indomie", 2_000)
    validateRequest(request)

    val request2 = CreateCategoryRequest("F", "Food")
    validateRequest(request2)
}