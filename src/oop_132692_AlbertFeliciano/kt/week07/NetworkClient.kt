package oop_00000132692_albert.week07
class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}