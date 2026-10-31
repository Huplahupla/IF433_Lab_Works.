package oop_132692_AlbertFeliciano.kt.week08

sealed class Product1

data class Electronic1(val id: String, val name: String, val warrantyMonths: Int) : Product1()
data class Clothing1(val id: String, val name: String, val size: String) : Product1()