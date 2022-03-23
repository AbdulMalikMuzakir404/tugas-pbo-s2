package NullPointer;

/*

Nama Pemrogram : Abdul Malik Muzakir
Kelas : XI
Tanggal Pembuatan : Senin 21 Maret 2022
Deskripsi : sebuah program yang memakai nullpointer exception

*/
import java.util.*;

public class ProgramKedua {
    public static void main(String[] args) {
        
        // deklarasi variable a dengan tipe data string
        Optional<String> a = Optional.ofNullable("hallo smkn 1 katapang" /*null*/);
        // menampilkan output dari variable a kelayar komputer
        System.out.println(a.orElse("tidak ada hasil"));
        
        /*
        
        keterangan:
        jadi kesimpulannya jika string a bernilai null tidak akan error.dan jika variable a bernilai
        null maka tampil pesan tidak ada hasil atau bisa dikosongkan.
        
        mohon maaf jika ada salah kata
        
        */
    }
}
