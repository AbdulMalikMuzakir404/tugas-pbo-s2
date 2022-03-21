package Arithmatic;


/*

Nama Pemrogram : Abdul Malik Muzakir
Kelas : XI
Tanggal Pembuatan : Senin 21 Maret 2022
Deskripsi : sebuah program yang tidak memakai arithmatic exception

*/

public class ProgramPertama {
    public static void main(String[] args) {
        
        // deklarasi variable dengan tipe data integer
        int nilai1 = 40;
        int nilai2 = 0;
        int total;
        
        // variable total akan menampung hasil bagi dari variable "nilai1 dan nilai2"
        total = nilai1 / nilai2;
        
        // menampilkan hasil dari pembagian diatas ke layar laptop
        System.out.println("hasil : " + total);
        
        /*
        
        keterangan:
        hasil diatas akan terjadi error karna secara matematika perhitungan
        ini tidak bisa dilakukan
        
        pesan error:
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	        at Arithmatic.ProgramPertama.main(ProgramPertama.java:20)
        C:\Users\abdul malik muzakir\AppData\Local\NetBeans\Cache\13\executor-snippets\run.xml:111: The following error occurred while executing this line:
        C:\Users\abdul malik muzakir\AppData\Local\NetBeans\Cache\13\executor-snippets\run.xml:68: Java returned: 1
        BUILD FAILED (total time: 1 second)

        */
    }
}
