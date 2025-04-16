import java.util.Scanner;

public class mainSiakad7 {
    public static void main(String[] args) {
        Scanner sc7 = new Scanner(System.in);

        dataMahasiswa data = new dataMahasiswa();
        data.tampilMahasiswa();
        System.out.println();

        System.out.println("Masukkan NIM yang ingin dicari: ");
        String nim = sc7.nextLine();
        data.cariMahasiswa(nim);
       
        System.out.println();
        System.out.println("Sorting Data Mahasiswa berdasarkan NIM: ");
        data.sortingByNim(data.nim);
        data.tampilMahasiswa();

    }
}
