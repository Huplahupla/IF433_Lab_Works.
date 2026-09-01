fun main(){
    val gameTitle: String = "Supra Bapak"
    val price: Int = 300000
    val discount = calculateDiscount(price)
    val total = price - discount

    println("Status: ${calculateStatus(price)}")

    printReceipt(gameTitle = gameTitle, price = price,total = total)

}
fun calculateStatus(price :Int ) = if (price > 500000) "discount 20%" else "discount 10%"

fun calculateDiscount (price: Int) = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()

fun printReceipt(gameTitle: String, price: Int, total: Int) {
    println("Terima Kasih Telah Berbelanja")
    println("Nama Game: $gameTitle")
    println("harga Total:Rp $total")
}