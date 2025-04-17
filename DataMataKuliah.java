public class DataMataKuliah {
    MataKuliah7 listMatkul[];
    int index; 
    DataMataKuliah(int jumMtakul){
        listMatkul = new MataKuliah7[jumMtakul];
    }

    void tambahData(MataKuliah7 matkul) {
        if (index < listMatkul.length) {
            listMatkul[index] = matkul;
            index++;
        }
    }

    void tampilDaftarMataKuliah(){
        System.out.println("Daftar Mata Kuliah");
        if(index != 0){
            for(int i =0; i< index;i++){
                listMatkul[i].tampilMataKuliah();
           }
        } else {
            System.out.println("Belum ada data mata kuliah.");
        }
    }
}