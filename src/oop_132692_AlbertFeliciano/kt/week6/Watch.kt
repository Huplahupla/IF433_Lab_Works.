package oop_132692_AlbertFeliciano.kt.week6

abstract class Watch {
    abstract fun showTime()

    interface BluetoothConnectable {
        fun BluetoothConnectable()
    }

    interface Rechargeable{
        fun chargeBattery()
    }

    abstract fun connectToBluetooth()
    abstract fun chargeBattery()
}