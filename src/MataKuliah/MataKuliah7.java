package MataKuliah;

public class MataKuliah7 {
    public String kodeMK, namaMK;
    public int sks;

    public MataKuliah7(String kodeMK, String namaMK, int sks){
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    public void tampilMataKuliah(){
        System.out.printf("%-7s: %-6s | %-4s: %-14s | %-4s: %-5s%n","Kode MK", kodeMK,"Nama", namaMK,"SKS", sks);
        
    }

    
}