package week4.kt

fun  main(){
    println("--- Testing Vehicle ---")
    val generalvehicle = vehicle(brand = "Sepeda Onthel")
    generalvehicle.honk()
    generalvehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar =`Car.kt`(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar
    myCar.accelerate()
}
