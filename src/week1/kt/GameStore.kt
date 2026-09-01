fun main(){
    val gameTitle: String = "Supra Bapak"
    val price: Int = 300000
    val discount = calculateDiscount(price)
    val total = price - discount

    println("Nama Game: $gameTitle ,Harga Asli: Rp $price" )

    println("Status: ${calculateStatus(price)}")
    println("Harga Akhir: $total" )


}
fun calculateStatus(price :Int ) = if (price > 500000) "discount 20%" else "discount 10%"

fun calculateDiscount (price: Int) = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()