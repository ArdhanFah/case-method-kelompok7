public class DataMataKuliah7 {

     // Method untuk menampilkan daftar matkul
     void tampilDaftarMataKuliah(MataKuliah7[] matkulList) {
        System.out.println("=== Daftar Mata Kuliah ===");
        for (int i = 0; i < matkulList.length; i++) {
            matkulList[i].tampilMataKuliah();
        }
    }
}