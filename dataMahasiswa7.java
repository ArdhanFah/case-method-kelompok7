public class dataMahasiswa7 {
    String[] nama = {"Ali Rahman","Budi Santoso", "Citra Dewi "};
    String[] nim = {"22001 ", "22003", "22002"};
    String[] prodi = {"Sistem Informasi Bisnis", "Informatika", "Informatika"};
    
    void tampilMahasiswa() {
        System.out.println("Nama\t\tNIM\t\tProdi");
        for (int i = 0; i < 3; i++) {
            System.out.println(nama[i] + "\t|\t" + nim[i] + "\t|\t" + prodi[i]);
        }
    }

    void cariMahasiswa(String NIM) {
        boolean ada = false;
        for (int i = 0; i < 3; i++) {
            if (nim[i].equals(NIM)) {
                System.out.println("==========================");
                System.out.println("Data Mahasiswa Ditemukan:");
                System.out.println("Nama: " + nama[i]);
                System.out.println("NIM: " + NIM);
                System.out.println("Prodi: " + prodi[i]);
                System.out.println("==========================");
                ada = true;
                break;
            }
        }
        if (!ada) {
            System.out.println("Data tidak ditemukan.");
        }
    }

    void sortingByNim(String [] nim) {
        for (int i = 1; i < nim.length; i++) {
            String temp = nim[i];
            int j = i-1;
            while (j >= 0 && nim[j].compareTo(temp) > 0) {
                nim[j+1] = nim[j];
                j--;
            }
        }
    }
}
