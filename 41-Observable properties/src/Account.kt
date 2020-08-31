import kotlin.properties.Delegates
import kotlin.properties.ObservableProperty

class Account(description: String = "") {
    val name: String by lazy {
        println("name is call")
        "alvin"
    }

    var description: String by Delegates.observable(description) { property, oldValue, newValue ->
        println("${property.name} change from $oldValue to $newValue")
    }
}