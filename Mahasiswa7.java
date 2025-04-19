public class Mahasiswa7 {

    String nama;
    String nim;
    String prodi;

    // Constructor
    
    public Mahasiswa7(String nama, String nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }

    public void tampilkanMahasiswa() {
        System.out.printf("%-15s| %-15s | %-15s |%n", nama, nim, prodi);
    }
}

