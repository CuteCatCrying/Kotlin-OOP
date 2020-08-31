fun main() {
    val male= Gender.MALE
    val female = Gender.FEMALE
    val allGenders: Array<Gender> = Gender.values()

    val maleFromString = Gender.valueOf("MALE")
    val femaleFromString = Gender.valueOf("FEMALE")

    println(maleFromString)
    println(femaleFromString)
    println(allGenders.toList())

    male.showDescription()
    female.showDescription()
}