package oop_00000132692_albert.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> println("Awas! Ada monster ${event.monsterName}!")
        is BattleState.LootDropped -> println("Mendapatkan loot: ${event.item.name} (${event.item.rarity})")
        is BattleState.GameOver -> println("Game Over! Alasan: ${event.reason}")
        BattleState.SafeZone -> println("Berada di zona aman.")
    }
}