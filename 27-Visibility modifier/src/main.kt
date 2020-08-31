/**
 * public > internal > protected > private
 *
 * internal = hanya bisa diakses di project yang sama
 */

fun main() {
    val teacher = Teacher("Alvin")
    println(teacher.name)

    val superTeacher = SuperTeacher("Zukron")
    superTeacher.test()
}