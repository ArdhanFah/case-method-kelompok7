public class dataMahasiswa7 {

    String nama;
    String nim ; 
    String prodi ;

    void dataMahasiswa7(String nama, String nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }

    void tampilkanDataMahasiswa() {
        System.out.println("Nama\t\tNIM\t\tProdi");
        System.out.println(nama + "|\t" + nim + "|\t" + prodi);

    }
}

    