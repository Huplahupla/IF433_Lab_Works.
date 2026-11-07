package oop_132692_AlbertFeliciano.kt.week09



fun main() {
    println("=== TEST LIST ===")
    // Immutable List: Tidak bisa diubah setelah dibuat
    val frameworks: List<String> = listOf("Kotlin", "Java", "C++")
    println("Immutable List: $frameworks")

    // Mutable List: Bisa ditambah/dikurangi
    val scores: MutableList<Int> = mutableListOf(85, 98)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: $scores")
}