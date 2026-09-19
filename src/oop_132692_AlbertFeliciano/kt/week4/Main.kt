package oop_132692_AlbertFeliciano.kt.week4

fun  main(){
    println("--- Testing Vehicle ---")
    val generalvehicle = vehicle(brand = "Sepeda Onthel")
    generalvehicle.honk()
    generalvehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar =`car`(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar
    myCar.accelerate()
}
