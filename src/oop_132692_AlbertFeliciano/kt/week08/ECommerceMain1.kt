package oop_132692_AlbertFeliciano.kt.week08

fun main() {
    val rawApiData: List> = listOf(
    mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
    mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
    mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"),
    mapOf("name" to "Ghost Item", "type" to "CLOTHING"),
    mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD")
    )

    val parser = ApiParser1()
    for (raw in rawApiData) {
        try {
            val product = parser.parseProduct(raw)
            product?.let {
                println("Parsed Product: $it")
                parser.checkout(it)
            }
        } catch (e: IllegalArgumentException) {
            println("LOG WARNING: Data Korup - ${e.message}")
        }
    }
}