public class DataPenilaian7 {

    Penilaian7[] listPenilaian;
    int index = 0;

    public DataPenilaian7(int jumlah) {
        listPenilaian = new Penilaian7[jumlah];
    }

    void tambahData(Penilaian7 p) {
        if (index < listPenilaian.length) {
            listPenilaian[index] = p;
            index++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampilPenilaian() {
        System.out.println("<===== Data Penilaian =====>");
        System.out.printf("%-15s %-15s %-15s", "Nama", "Mata Kuliah", "Nilai Akhir");
        for (Penilaian7 p : listPenilaian) {
            if (p != null) {
                String namaMhs = p.mahasiswa.nama;
                String namaMtkl = p.matkul.kodemk;
                p.hitungNilaiAkhir();
                double nilaiAkhir = p.nilaiAkhir;
                System.out.printf("%-15s %-15s %-15s" , namaMhs, namaMtkl, nilaiAkhir);
            }
        }
    }

    void sortNilaiAkhir() {
        for (int i = 0; i < index - 1; i++) {
            for (int j = 0; j < index - i - 1; j++) {
                if (listPenilaian[j].nilaiAkhir > listPenilaian[j + 1].nilaiAkhir) {
                    Penilaian7 temp = listPenilaian[j];
                    listPenilaian[j] = listPenilaian[j + 1];
                    listPenilaian[j + 1] = temp;
                }
            }
        }
    }

    void tampilSortNilaiAkhir() {
        sortNilaiAkhir();
        tampilPenilaian();
    }

}
