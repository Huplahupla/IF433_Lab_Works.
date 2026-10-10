package oop_00000132692_albert.week07

fun main() {
    println("\n=== TEST RPG SYSTEM ===")
    GameManager.startGame()
    GameManager.startGame()

    println("Drop chance Legendary: ${ItemRarity.LEGENDARY.dropChance}%")
    val starterWeapon = Weapon.forgeStarterSword()
    println("Senjata awal: ${starterWeapon.item.name}, Damage: ${starterWeapon.item.damage}, Durability: ${starterWeapon.durability}")
}