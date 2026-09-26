
package week4.kt

class electricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int) : car(brand, numberOfDoors) {


package oop_nim_albert.week04

import oop_132692_AlbertFeliciano.kt.week4.car

class electricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int) : car(brand, numberOfDoors) {
>>>>>>> b9ee307 (week04: (task 1) test ElectricCar in main):src/oop_132692_AlbertFeliciano/kt/week4/ElectricCar.kt
    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }
}