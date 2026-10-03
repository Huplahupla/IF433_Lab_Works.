package oop_00000132692_albertfeliciano.week06

fun main() {
    // 1. Instansiasi perangkat smart home
    val lamp = SmartLamp("L001", "Ruang Tamu")
    val speaker = SmartSpeaker("S001", "Google Nest Dapur")
    val cctv = SmartCCTV("C001", "Ezviz Garasi")

    // 2. Instansiasi SmartHomeHub dan tambahkan perangkat
    val hub = SmartHomeHub()
    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    // 3. Pengujian Fitur Keamanan (Security Mode)
    println("\n=== PENGUJIAN SECURITY MODE ===")
    hub.activateSecurityMode()

    // 4. Pengujian Mematikan Semua Perangkat (Switchable)
    println("\n=== PENGUJIAN MEMATIKAN SEMUA SWITCH ===")
    hub.turnOffAllSwitches()
}