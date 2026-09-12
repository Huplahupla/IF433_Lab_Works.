package week03

class employee (val name: String) {
    var salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke : $value")
            this.salary = value
        }
}