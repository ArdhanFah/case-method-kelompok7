public class DataMahasiswa7 {

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
    
    // method untuk mencari by nim
    void sortingByNim(Mahasiswa7[] arrMhs7) {
        
        for (int i = 1; i < arrMhs7.length; i++) {
            Mahasiswa7 temp = arrMhs7[i]; //membuat temp dari tipe data Mahasiswa7
            int j = i-1;
            while (j >= 0 && arrMhs7[j].nim.compareTo(temp.nim) > 0) { // > 0 untuk ascending(positif), < 0 untuk descending
                arrMhs7[j+1] = arrMhs7[j];
                j--;
            }
            //jgn lupa j+1 agar tidak out of index
            arrMhs7[j+1] = temp;
        }
    }
}
