package week4.kt

class electricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int) : car(brand, numberOfDoors) {

    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }
}