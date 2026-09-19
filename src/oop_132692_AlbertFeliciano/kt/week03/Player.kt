package oop_132692_AlbertFeliciano.kt.week03

class player(var username: String) {
    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount > 0) {
            val oldLevel = this.level
            xp += amount
            if (this.level > oldLevel) {
                println("Level Up! Selamat $username naik ke level ${this.level}")
            }
        }
    }
}