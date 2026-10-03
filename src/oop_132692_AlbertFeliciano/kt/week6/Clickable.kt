package oop_132692_AlbertFeliciano.kt.week6

interface Clickable {
    val name: String

    fun click()

    class button(override val name : String) : Clickable {
        override fun click() {
            println("Tombol '$name' berhasi diklik")
        }
    }
}