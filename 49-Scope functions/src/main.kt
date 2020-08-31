fun main() {
    val student = Student("Alvin", 20)
    student.let {
        println(it.name)
        println(it.age)
    }

    // let
    val result: String = student.let {
        "Name ${it.name}, age ${it.age}"
    }
    println(result)

    // run
    val result2: String = student.run {
        "Name ${this.name}, age ${this.age}"
    }
    println(result2)

    // apply
    val result3: Student = student.apply {
        "Name ${this.name}, age ${this.age}"
    }
    println(result3)

    // also
    val result4: Student = student.also {
        "Name ${it.name}, age ${it.age}"
    }
    println(result4)

    // with
    val result5: String = with(student) {
        "Name ${this.name}, age ${this.age}"
    }
    println(result5)
}