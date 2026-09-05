package week2.kt

import java.util.Scanner

fun main() {
    val scanner = Scanner( System.`in`)

    println("- - - APLIKASI PBM UMN - - - ")

    println("Masukkan Nama: ")
    val name = scanner.nextLine()

    println("Masukkan NIm(Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine()

    if (nim.length != 5){
        println("ERROR: pendaftaran dibatalkan. NIM garus 5 karakter!")

    } else {
        print("masukkan Jurusan: ")
        val major = scanner.nextLine()

        val s1 = student(name, nim, major = major)
        println("Status: pendaftaran selesai.")
    }

    print("Pilih Jalur (1. Reguler, 2. Umum")
    val type = scanner.nextInt()
    scanner.nextLine()

    if (type == 1){
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        val s1 = student(name, nim, major)
        println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
    } else if (type == 2){
        val s2 = student(name, nim)
        println("Terdaftar di : ${s2.major} dengan GPA awal ${s2.gpa}")
    } else {
        println("Pilihan ngawur, pendaftaran batal!")
    }

}
