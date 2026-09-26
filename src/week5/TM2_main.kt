package week5

fun main() {
    val myEWallet = EWallet("Dompet Digital", 50000.0)
    val myCreditCard = CreditCard("Kartu Kredit", 100000.0)

   val daftarPembayaran: List<PaymentMethod> = listOf(myEWallet, myCreditCard)

    println("=== PROSES TRANSAKSI E-COMMERCE ===")

    for (metode in daftarPembayaran) {
        println("Memproses pembayaran Rp75000.0 menggunakan: ${metode.accountName}")
        metode.processPayment(75000.0)
        println("--------------------------------------------------")
    }
}