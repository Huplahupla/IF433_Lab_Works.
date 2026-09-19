package week4.kt

open class `car`(brand: String, val numberOfDoors: Int) : vehicle(brand) {
    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }

    override fun honk() {
        println("TIN TIN! Mobil $brand lewat!")
    }

    override fun accelerate() {
        super.accelerate()
        println("Mobil $brand dengan menggunakan transmisi gigi untuk menambah kecepatan")
    }
}