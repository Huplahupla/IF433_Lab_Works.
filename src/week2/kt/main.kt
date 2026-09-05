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

}
