public class dataMahasiswa7 {

    // Method untuk menampilkan data mahasiswa
    void tampilkanMahasiswa(Mahasiswa7[] arrMhs7) {
        for (int i = 0; i < arrMhs7.length; i++) {
            System.out.println("Nama: " + arrMhs7[i].nama + ", NIM: " + arrMhs7[i].nim + ", Prodi: " + arrMhs7[i].prodi);
        
        }
    
    }

    // Method untuk mencari data mahasiswa berdasarkan NIM
    void cariMahasiswa(Mahasiswa7[] arrMhs7, String nim) {
        for (int i = 0; i < arrMhs7.length; i++) {
            if (arrMhs7[i].nim.equals(nim)) {
                System.out.println("Data ditemukan: Nama: " + arrMhs7[i].nama + ", NIM: " + arrMhs7[i].nim + ", Prodi: " + arrMhs7[i].prodi);
                return;
            }
        }
        System.out.println("Data tidak ditemukan.");
    }
}
