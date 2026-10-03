package oop_00000132692_albertfeliciano.week06

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {
    override fun turnon() {
        println("Lampu $name menyala menerangi ruangan.")
    }

    override fun turnoff() {
        println("Lampu $name dimatikan.")
    }
}