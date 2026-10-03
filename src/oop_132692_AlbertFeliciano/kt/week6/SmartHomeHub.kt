package oop_00000132692_albertfeliciano.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Perangkat '${device.name}' berhasil ditambahkan ke Hub.")
    }

    fun turnOffAllSwitches() {
        println("\n--- Mematikan Semua Perangkat Switchable ---")
        for (device in devices) {
            if (device is Switchable) {
                device.turnoff()
            }
        }
    }

    fun activateSecurityMode() {
        println("\n--- Mengaktifkan Mode Keamanan ---")
        for (device in devices) {
            // Deteksi perangkat Recordable
            if (device is Recordable) {
                device.startRecord()
            }
            // Deteksi perangkat SmartSpeaker menggunakan Smart Casting
            if (device is SmartSpeaker) {
                device.playMusic("Sirine Peringatan")
            }
        }
    }
}