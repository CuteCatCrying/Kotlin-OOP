fun main() {
    val note = Note("My note")
    note.title = ""
    println(note.title)

    note.title = "note diubah"
    println(note.title)

    val bigNote = BigNote("Big Note")
    println(bigNote.title)
    println(bigNote.bigNote)
}