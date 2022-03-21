package Arithmatic;

/*

Nama Pemrogram : Abdul Malik Muzakir
Kelas : XI
Tanggal Pembuatan : Senin 21 Maret 2022
Deskripsi : sebuah program yang memakai arithmatic exception

*/

public class ProgramKedua {
    public static void main(String[] args) {
        
        /*
        fungsi try
        try digunakan untuk menentukan blok diamana kita harus menempatkan kode exception.
        blok try harus diikuti oleh salah satu, try atau finally. artinya, kita tidak bisa mengguakan
        blok try sendirian
        
        */ 
        try {
            
            // deklarasi variable dengan tipe data integer
            int nilai1 = 40;
            int nilai2 = 0;
            int total;

            // variable total akan menampung hasil bagi dari variable "nilai1 dan nilai2"
            total = nilai1 / nilai2;
            
        /*
            
        fungsi catch
        catch digunakan untuk menangani exception. harus diawali dengan blok try yang artinya
        kita tidak bisa menggunakan blok catch saja. bisa diikuti blok finally
        
        */
        //ArithmeticException fungsinya agar jika kode yang kita jalankan diatas error masih bisa dijalankan
        } catch(ArithmeticException e) {System.out.println(e);}
        System.out.println("hasil...");
        
        /*
        
        keterangan:
        jadi kesimpulannya penggunaan ArithmeticException ini bertujuan agar jika ada program yang
        error masih bisa berjalan dengan success
        
        */
    }
}
