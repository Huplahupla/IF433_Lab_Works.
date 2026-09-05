package week2.kt

class student (val name: string, val nim: string, var major: string) {
    init {
        if(nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG : objek student $name berhasil dialokasikan di Memory")
        }
    }
}