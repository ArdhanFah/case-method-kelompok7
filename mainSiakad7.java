import java.util.Scanner;

public class mainSiakad7 {
    public static void main(String[] args) {
        Scanner sc7 = new Scanner(System.in);   // Untuk Input Karakter
        Scanner sci7 = new Scanner(System.in);  // Untuk Input Angka

        Mahasiswa7[] arrMhs7 = new Mahasiswa7[3];
        arrMhs7[0] = new Mahasiswa7("Ali Rahman", "22001", "Sistem Informasi Bisnis");
        arrMhs7[1] = new Mahasiswa7("Citra Dewi", "22003", "Informatika");
        arrMhs7[2] = new Mahasiswa7("Budi Santoso", "22002", "Informatika");

        DataMataKuliah daftarMatkul = new DataMataKuliah(3);
        daftarMatkul.tambahData(new MataKuliah7("MK001", "Struktur Data", 3));
        daftarMatkul.tambahData(new MataKuliah7("MK002", "Basis Data", 3));
        daftarMatkul.tambahData(new MataKuliah7("MK003", "Desain Web", 3));


        DataMahasiswa7 dataMhs7 = new DataMahasiswa7(); //inisialisasi objek dataMhs7
        
        Penilaian7[] arrPen = {
            new Penilaian7(arrMhs7[0], matkulList[1], 80, 85, 90), // Ali - Basis Data
            new Penilaian7(arrMhs7[1], matkulList[0], 60, 75, 70), // Budi - Struktur Data
            new Penilaian7(arrMhs7[2], matkulList[1], 75, 70, 80), // Citra - Basis Data
            new Penilaian7(arrMhs7[2], matkulList[2], 85, 90, 95)  // Citra - Desain Web
        };

        DataPenilaian7 dataPen7 = new DataPenilaian7(arrPen.length);

        do{        
            System.out.println("=== MENU SISTEM AKADEMIK ===");
            System.out.printf("1. Tampilkan Daftar Mahasiswa%n2. Tampilkan Daftar Mata Kuliah%n3. Tampilkan Data Penilaian%n4. Urutkan Mahasiswa Berdasarkan Nilai AKhir%n5. Cari Mahasiswa Berdasarkan NIM%n8. Keluar%n");
            System.out.print("Pilihan Menu: ");
            int choice = sci7.nextInt();
            switch (choice) {
                case 1:
                    dataMhs7.tampilkanMahasiswa(arrMhs7);
                    break;
                case 2:     
                    daftarMatkul.tampilDaftarMataKuliah();         
                    break;
                case 3:  
                    dataPen7.tampilPenilaian();    
                    break;
                case 4:
                    dataPen7.tampilSortNilaiAkhir();
                    break;
                case 5:    
                    System.out.println("=========================================");
                    System.out.println("Pencarian Data Mahasiswa");
                    System.out.println("Masukkan NIM yang dicari: ");
                    String nim = sci7.nextLine();
                    dataMhs7.cariMahasiswa(arrMhs7,nim);
                    System.out.println("=========================================");
                    break;
                case 0: 
                    System.out.println("Byee!!");   
                    return;
                default:
                    System.out.println("Masukkan Menu yang benar!!!");
            } 
        }while(true);

        
        

        System.out.println();
        System.out.println("Sorting Data Mahasiswa berdasarkan NIM: ");
        dataMhs7.sortingByNim(arrMhs7);
        dataMhs7.tampilkanMahasiswa(arrMhs7);
        System.out.println("=========================================");
    }
}
