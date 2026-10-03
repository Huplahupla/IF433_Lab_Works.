
import oop_132692_AlbertFeliciano.kt.week6.Watch

// Parent Class (Watch) ditulis pertama, diikuti interface dipisahkan koma
class Smartwatch : Watch(), Watch.BluetoothConnectable, Watch.Rechargeable {

    override fun showTime() {
        println("Layar OLED menyala: 14:00 WIB")
    }

    override fun connectToBluetooth() {
        println("Mencari perangkat HP di sekitar untuk pairing...")
    }

    override fun chargeBattery() {
        println("Mengisi daya menggunakan charger magnetik 15W.")
    }

    override fun BluetoothConnectable() {
        TODO("Not yet implemented")
    }
}