package Penilaian;
import Mahasiswa.Mahasiswa7;
import MataKuliah.MataKuliah7;

public class Penilaian7{
    public Mahasiswa7 mahasiswa;
    public MataKuliah7 matakuliah;
    public double nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
    
    public Penilaian7(Mahasiswa7 mahasiswa, MataKuliah7 matakuliah, double nilaiTugas, double nilaiUTS, double nilaiUAS){
        this.mahasiswa = mahasiswa;
        this.matakuliah = matakuliah;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    void hitungNilaiAkhir(){
        this.nilaiAkhir = (0.3 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
    }
}