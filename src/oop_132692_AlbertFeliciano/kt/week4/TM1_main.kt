package oop_132692_AlbertFeliciano.week4

import oop_nim_albert.week04.electricCar

fun main() {
    println("--- Testing ElectricCar ---")
    // Panggil class dengan awalan huruf kapital: ElectricCar
    val myElectricCar = electricCar(brand = "Tesla", numberOfDoors = 4, batteryCapacity = 85)
    myElectricCar.accelerate()
    myElectricCar.honk()
    myElectricCar.openTrunk()
}