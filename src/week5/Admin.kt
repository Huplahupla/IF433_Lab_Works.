package week5

class Admin(nama: String) : Pegawai(nama){
    override fun bekerja() {
        println("[$nama] sedang duduk di depan komputer melayani administrasi.")
    }

    fun doAdminwork() {
        println("[$nama] sedang merakap data absensi mahasiswa.")
    }
}