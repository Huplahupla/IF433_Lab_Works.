package week4.kt

open class vehicle(val brand: String) {
    var speed: Int = 0


open fun accelerate(){
    speed += 10
    println("$brand melaju. kecepatan:$speed km/jam")
}

    open fun honk(){
    println("beep beep")
    }
}