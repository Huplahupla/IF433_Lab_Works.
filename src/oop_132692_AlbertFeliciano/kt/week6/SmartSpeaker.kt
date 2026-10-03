package oop_00000132692_albertfeliciano.week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {
    override fun turnon() {
        println("Smart Speaker $name aktif dan siap menerima perintah suara.")
    }

    override fun turnoff() {
        println("Smart Speaker $name dimatikan.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}