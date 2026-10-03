package oop_00000132692_albertfeliciano.week06

fun main() {
    // 1. Instansiasi perangkat smart home
    val lamp = SmartLamp("L001", "Ruang Tamu")
    val speaker = SmartSpeaker("S001", "Google Nest Dapur")
    val ccvt = SmartCCTV("C001", "Ezviz Garasi")

    // Checkpoint 19: Instansiasi perangkat di main
    // (Lakukan git commit jika dicicil, atau langsung lanjut ke testing akhir)

    // 2. Instansiasi SmartHomeHub dan tambahkan perangkat
    val hub = SmartHomeHub()
    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(ccvt)

    println("\n=== PENGUJIAN SECURITY MODE ===")
    hub.activateSecurityMode()

    println("\n=== PENGUJIAN MEMATIKAN SEMUA SWITCH ===")
    hub.turnOffAllSwitches()
}