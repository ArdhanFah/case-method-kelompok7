public class dataMahasiswa7 {

    String[] nama;
    String[] nim ; 
    String[] prodi ;

    void dataMahasiswa7(String[] nama, String[] nim, String[] prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }

    void tampilkanDataMahasiswa() {
        System.out.println("Nama\t\tNIM\t\tProdi");
        for (int i = 0; i < nama.length; i++) {
            System.out.println(nama[i] + "|\t" + nim[i] + "|\t" + prodi[i]);
        }
    }
}

    