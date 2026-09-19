package oop_nim_albert.week04

class developer(name: String, baseSalary: Int, val programmingLanguage: String) : employee(name, baseSalary) {
    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage.")
    }
}