import java.util.Scanner;
// Add imports or ensure Mahasiswa7 and dataMahasiswa7 are accessible
// import kelompok7.Mahasiswa7;
// import kelompok7.dataMahasiswa7;

public class mainSiakad7 {
    public static void main(String[] args) {
        Scanner sc7 = new Scanner(System.in);

        Mahasiswa7[] arrMhs7 = new Mahasiswa7[3];
        arrMhs7[0] = new Mahasiswa7("Ali Rahman", "22001", "Sistem Informasi Bisnis");
        arrMhs7[1] = new Mahasiswa7("Citra Dewi", "22003", "Informatika");
        arrMhs7[2] = new Mahasiswa7("Budi Santoso", "22002", "Informatika");

        dataMahasiswa7 dataMhs7 = new dataMahasiswa7(arrMhs7);
        dataMhs7.tampilkanMahasiswa();
        System.out.println("=========================================");
        System.out.println("Pencarian Data Mahasiswa");
        System.out.println("Masukkan NIM yang dicari: ");
        String nim = sc7.nextLine();
        dataMhs7.cariMahasiswa(nim);
        System.out.println("=========================================");
    }
}
