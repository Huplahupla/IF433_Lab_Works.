package week2.kt

import java.util.Scanner

class Loan(
    val bookTitle: String,
    val borrower: String,
    var loanDuration: Int = 1
) {
    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else{
            0
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    println("- - - Selamat Berpinjam Ria - - -")

    println("Judul:")
    val bookTitle = scanner.nextLine()

    println("Peminjam:")
    val borrower = scanner.nextLine()

    println("Lama Pinjam (hari):")
    var loanDuration = scanner.nextInt()

    if(loanDuration < 0){
        println("WARNING: Lama pinjaman tidak boleh minus. Otomatis diatur ke 1 hari")
    loanDuration = 1
    }

    val transaksi = Loan(bookTitle, borrower, loanDuration)


    println("\n- - - KONFIRMASI - - -")
    println("Detail Pinjaman: Buku '${transaksi.bookTitle}' dipinjam oleh ${transaksi.borrower} selama ${transaksi.loanDuration} hari.")
    println("Total Denda: Rp ${transaksi.calculateFine()}")
}