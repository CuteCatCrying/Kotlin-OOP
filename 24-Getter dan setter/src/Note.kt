class Note(title: String) {
    var title: String = title
        get() {
            println("call getter")
            return field
        }
        set(value) {
            println("call setter")
            if (value.isNotBlank()) {
                field = value
            }
        }
}

class BigNote(val title: String) {
    val bigNote: String
        get() = title.toUpperCase()
}