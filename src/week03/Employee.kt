package week03

class employee (val name: String) {
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Gaji tidak boleh negatif! Si-set ke 0. ")
                field = 0
            } else {
            field = value
            }
        }
}