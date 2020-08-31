package data

class Car(
    paramBrand: String,
    paramYear: Int = 2020
) {
    init {
        println("Car $paramBrand dibuat")
    }

    var brand = paramBrand
    var year = paramYear
}