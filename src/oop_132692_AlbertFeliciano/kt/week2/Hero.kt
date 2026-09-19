package week2

import java.util.Scanner

class Hero(val name: String, val baseDamage: Int, var hp: Int = 100) {

    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0) {
            hp = 0
        }
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    println("Masukkan nama hero:")
    val name = scanner.nextLine()

    println("Masukkan stat Damage:")
    val baseDamage = scanner.nextInt()

    val playerHero = Hero(name, baseDamage)
    var enemyHp = 100

    while (playerHero.isAlive() && enemyHp > 0) {
        println("\nMenu: 1. Serang, 2. Kabur")
        print("Pilihan Anda: ")

        // FIX: Change to nextInt() to match the integer comparisons below
        val choice = scanner.nextInt()

        if (choice == 1) {
            playerHero.attack("Musuh")
            enemyHp -= playerHero.baseDamage
            if (enemyHp < 0) enemyHp = 0
            println("Sisa HP Musuh: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Musuh membalas serangan dengan damage $enemyDamage!")
                playerHero.takeDamage(enemyDamage)
                println("Sisa HP ${playerHero.name}: ${playerHero.hp}")
            }
        } else if (choice == 2) {
            println("${playerHero.name} melarikan diri dari medan pertempuran!")
            break
        } else {
            println("Input tidak valid, silakan pilih 1 atau 2.")
        }
    }

    println("\n=== Hasil Akhir ===")
    if (!playerHero.isAlive()) {
        println("Kalah! Musuh berhasil mengalahkan ${playerHero.name}.")
    } else if (enemyHp == 0) {
        println("Menang! ${playerHero.name} berhasil mengalahkan Musuh.")
    } else {
        println("Pertarungan berakhir seri karena ${playerHero.name} kabur (Sisa HP Hero: ${playerHero.hp}, Sisa HP Musuh: $enemyHp).")
    }
}