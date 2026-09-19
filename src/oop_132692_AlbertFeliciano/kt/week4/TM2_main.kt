package oop_132692_AlbertFeliciano.week4

import oop_nim_albert.week04.developer
import oop_nim_albert.week04.manager

fun main() {
    println("--- Testing Employee Hierarchy ---")
    val manager = manager(name = "Pak Bos", baseSalary = 15000000)
    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    val developer = developer(name = "Albert", baseSalary = 8000000, programmingLanguage = "Kotlin")
    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}