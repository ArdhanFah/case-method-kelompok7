public class dataMahasiswa7 {
    private Mahasiswa7[] arrMhs7;

    // Constructor to initialize the array
    public dataMahasiswa7(Mahasiswa7[] arrMhs7) {
        this.arrMhs7 = arrMhs7;
    }

    // Method to display all students
    public void tampilkanMahasiswa() {
        for (Mahasiswa7 mhs : arrMhs7) {
            System.out.println("Nama: " + mhs.nama + ", NIM: " + mhs.nim + ", Prodi: " + mhs.prodi);
        }
    }

    // Method to search for a student by NIM
    public void cariMahasiswa(String nim) {
        for (Mahasiswa7 mhs : arrMhs7) {
            if (mhs.nim.equals(nim)) {
                System.out.println("Data ditemukan: Nama: " + mhs.nama + ", NIM: " + mhs.nim + ", Prodi: " + mhs.prodi);
                return;
            }
        }
        System.out.println("Data tidak ditemukan.");
    }
}