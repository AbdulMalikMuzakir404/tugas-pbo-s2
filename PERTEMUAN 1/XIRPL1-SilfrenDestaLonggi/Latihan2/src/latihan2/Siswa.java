package latihan2;

public class Siswa {
    
    int nis;
    String nama;
    
    void insertData(int NoInduk, String NamaSiswa) {
        this.nis = NoInduk;
        this.nama = NamaSiswa;
    }
    
    void TampilData() {
        System.out.println("NoInduk" +" = "+ this.nis);
        System.out.println("NamaSiswa" +" = "+ this.nama);
    }
    
}
