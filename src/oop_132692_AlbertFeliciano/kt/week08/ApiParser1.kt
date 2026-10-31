package oop_132692_AlbertFeliciano.kt.week08

class ApiParser1 {
    fun parseProduct(rawJson: Map<String, Any?>): Product1? {
        val id = requireNotNull(rawJson["id"] as? String) { "API Invalid: Missing ID" }
        val name = requireNotNull(rawJson["name"] as? String) { "API Invalid: Missing Name" }
        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                val warranty = rawJson["warranty"] as? Int ?: 12
                Electronic1(id, name, warranty)
            }
            "CLOTHING" -> {
                val size = rawJson["size"] as? String ?: "All Size"
                Clothing1(id, name, size)
            }
            else -> null
        }
    }

    fun checkout(product: Product1) {
        val id = when (product) {
            is Electronic1 -> product.id
            is Clothing1 -> product.id
        }
        val paymentStatus = JavaPaymentService1.processPayment(id)
        println("Payment: ${paymentStatus!!}")
    }
}