package oop_00000132692_albertfeliciano.week06 // Sesuaikan dengan NIM dan nama Anda

interface SmartDevice {
    val id: String
    val name: String
}

interface Switchable {
    fun turnon()
    fun turnoff()
}

interface Recordable {
    fun startRecord()
    fun stopRecord() {
        println("Perekaman dihentikan dan disimpan ke Cloud.")
    }
}