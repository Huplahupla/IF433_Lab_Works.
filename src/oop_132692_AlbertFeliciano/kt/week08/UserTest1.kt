package oop_132692_AlbertFeliciano.kt.week08


object DatabaseMock1 {
    fun findUser(id: Int): UserProfile? {
        return if (id == 1) UserProfile("TestUser", "test@test.com") else null
    }
}

fun runMockUnitTest1() {
    println("\n=== RUNNING UNIT TEST 1 ===")
    val testUser = DatabaseMock1.findUser(1)
    val initial = testUser!!.name.substring(0, 1)
    check(initial == "T") { "Test Failed! Initial is wrong." }
    println("Test Passed: Initial is T")
}