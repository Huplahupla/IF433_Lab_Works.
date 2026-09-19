package oop_nim_albert.week04

open class employee(val name: String, val baseSalary: Int) {
    open fun work() {
        println("$name sedang bekerja.")
    }

    open fun calculateBonus(): Int {
        return (baseSalary * 0.10).toInt()
    }
}