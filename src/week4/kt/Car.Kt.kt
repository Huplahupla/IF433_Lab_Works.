package week4.kt

open class Car(brand: String, val numberOfDoors: Int) : vehicle(brand) {
    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }
}