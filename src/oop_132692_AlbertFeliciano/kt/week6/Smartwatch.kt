package oop_132692_AlbertFeliciano.kt.week6

class Smartwatch : Watch(), Watch.BluetoothConnectable, Repeatable {
    override fun showTime() {
        println("Layar OLED menyala: 14:00 WIB")
    }

    override fun connectToBluetooth(){
        println("mencari perangkat Hp di sekitar untuk pairing...")
    }

    override  fun chargeBattery(){
        println("Mengisi daya menggunakan charger magnetik 15W.")
    }
}