package oop_132692_AlbertFeliciano.kt.week5

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}