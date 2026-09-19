package oop_132692_AlbertFeliciano.kt.week03

fun main() {
    // 1. Pengujian Employee
    val e = employee("Budi")
    e.salary = 5000000
    println("Gaji: ${e.salary}")
    e.increasePerformance()
    println("Pajak yang harus dibayar: ${e.tax}")

    // 2. Pengujian Weapon (Task 1)
    println("\n--- Test Task 1: Weapon ---")
    val pedang = weapon("Excalibur")
    pedang.damage = -50
    pedang.damage = 9999
    println("Tier Pedang: ${pedang.tier}")

    // 3. Pengujian Player (Task 2)
    println("\n--- Test Task 2: Player ---")
    val player1 = player("Albert")
    player1.addXp(50)
    player1.addXp(60)
}