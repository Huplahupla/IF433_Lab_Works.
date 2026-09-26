package week5

fun main(){
    val dosen1 = Dosen(nama="Pak Alex", nidn= "013456")
    val admin1 = Admin(nama = "Bu Siti")

    val daftarpegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("= = = AKTIVITAS PEGAWAI = = =")
    for (Pegawai in daftarpegawai) {
        Pegawai.bekerja()

        when (Pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${Pegawai.nidn})")
                Pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                Pegawai.doAdminwork()
            }
        }
    }
}