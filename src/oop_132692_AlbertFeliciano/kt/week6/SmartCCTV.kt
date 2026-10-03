package oop_00000132692_albertfeliciano.week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {
    override fun turnon() {
        println("Kamera CCTV $name diaktifkan.")
        startRecord() // Otomatis memanggil startRecord saat menyala
    }

    override fun turnoff() {
        println("Kamera CCTV $name dimatikan.")
        stopRecord()
    }

    override fun startRecord() {
        println("CCTV $name mulai merekam video pengawasan.")
    }
}