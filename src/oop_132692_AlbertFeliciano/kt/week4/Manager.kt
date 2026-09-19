package oop_nim_albert.week04

class manager(name: String, baseSalary: Int) : employee(name, baseSalary) {
    override fun work() {
        println("$name sedang memimpin rapat divisi.")
    }

    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500000
    }
}