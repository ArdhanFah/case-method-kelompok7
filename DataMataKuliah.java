public class DataMataKuliah {
    MataKuliah listMatkul[];
    int index; 
    DataMataKuliah(int jumMtakul){
        listMatkul = new MataKuliah[jumMtakul];
    }

    void tambahData(MataKuliah matkul) {
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
        }
    }
}