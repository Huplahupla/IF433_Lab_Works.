package oop_132692_AlbertFeliciano.kt.week4

fun main() {
    println("--- Testing ElectricCar ---")
    val myElectricCar = ElectricCar(brand = "Tesla", numberOfDoors = 4, batteryCapacity = 85)

    myElectricCar.accelerate()
    myElectricCar.honk()
    myElectricCar.openTrunk()
}