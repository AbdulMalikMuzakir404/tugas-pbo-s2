package NullPointer;

/*

Nama Pemrogram : Abdul Malik Muzakir
Kelas : XI
Tanggal Pembuatan : Senin 21 Maret 2022
Deskripsi : sebuah program yang tidak memakai nullpointer exception

*/

public class ProgramPertama {
    public static void main(String[] args) {
        // deklarasi variable a dengan tipe data string
        String a = null;
        // menampilkan output dari variable a kelayar komputer
        System.out.println(a.length());
        
        /*
        
        keterangan:
        akan terjadi error karna variable a bernilai null
        
        pesan error:
        Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "a" is null
                at NullPointer.ProgramPertama.main(ProgramPertama.java:17)
        C:\Users\abdul malik muzakir\AppData\Local\NetBeans\Cache\13\executor-snippets\run.xml:111: The following error occurred while executing this line:
        C:\Users\abdul malik muzakir\AppData\Local\NetBeans\Cache\13\executor-snippets\run.xml:68: Java returned: 1
        BUILD FAILED (total time: 1 second)
        
        */
    }
}
