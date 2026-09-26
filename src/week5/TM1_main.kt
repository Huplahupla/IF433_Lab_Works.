package week5

fun main() {
    val mathHelper = MathHelper()

    println("=== HASIL HITUNG LUAS ===")
    println("Luas Persegi (sisi 5): ${mathHelper.hitungLuas(5)}")
    println("Luas Persegi Panjang (4x6): ${mathHelper.hitungLuas(4, 6)}")
    println("Luas Lingkaran (jari-jari 7.0): ${mathHelper.hitungLuas(7.0)}")
}