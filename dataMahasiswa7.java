public class DataMahasiswa7 { // Perbaikan nama kelas dengan huruf kapital

    // Method untuk menampilkan data mahasiswa
    public void tampilkanMahasiswa(Mahasiswa7[] arrMhs7) { // Tambahkan modifier public
        System.out.println("=========================================");
        System.out.println("Data Mahasiswa: ");
        System.out.println("Nama \t| NIM | \t Prodi");
        for (int i = 0; i < arrMhs7.length; i++) {
            arrMhs7[i].tampilkanMahasiswa(); //memanggil method tampilkanMahasiswa() dari class Mahasiswa7
        }
    }

    // Method untuk mencari data mahasiswa berdasarkan NIM
    public void cariMahasiswa(Mahasiswa7[] arrMhs7, String nim) { // Tambahkan modifier public
        for (int i = 0; i < arrMhs7.length; i++) {
            if (arrMhs7[i].nim.equals(nim)) {
                System.out.println("Data ditemukan: ");  
                arrMhs7[i].tampilkanMahasiswa();
                return;
            }
        }
        System.out.println("Data tidak ditemukan.");
    }
    
    // Method untuk sorting data mahasiswa berdasarkan NIM
    public void sortingByNim(Mahasiswa7[] arrMhs7) { // Tambahkan modifier public
        for (int i = 1; i < arrMhs7.length; i++) {
            Mahasiswa7 temp = arrMhs7[i]; //membuat temp dari tipe data Mahasiswa7
            int j = i-1;
            while (j >= 0 && arrMhs7[j].nim.compareTo(temp.nim) > 0) { //ascending kecil - besar 
                //menggunakan ascii untuk membandingkan nim , 
                //compaareTo() untuk membandingkan string, jika lebih besar dari 0 maka urutan nim diurutkan dari kecil ke besar
                //dengan cara membandingkan 1 kata per 1 kata
            //cara membacanya value j dikurangi value temp(secara angka ascii), dan jika plus(asc) yang menandakan j > temp
                arrMhs7[j+1] = arrMhs7[j]; 
                j--;
            }
            //j = -1 
            //jgn lupa j+1 agar tidak out of index
            arrMhs7[j+1] = temp; //agar j=0
        }
        tampilkanMahasiswa(arrMhs7);
    }
}
