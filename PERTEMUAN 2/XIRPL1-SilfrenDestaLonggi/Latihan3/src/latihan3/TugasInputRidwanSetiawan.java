/*

Authour By Silfren And Abdul And Ridwan
31/01/2022
PBO

*/

package latihan3;

import java.util.*;

public class TugasInputRidwanSetiawan {
    public static void main(String[] args) {
        
         String nama;
         int tugas, quiz, uts, uas;
         double nilaiAkhir, status;
          
         Scanner input = new Scanner(System.in);
         System.out.println("========== REKAP NILAI SISWA ==========");
         System.out.print("Masukan Nama Siswa : ");
         nama = input.nextLine();
         
         System.out.println("=======================================");
         
         System.out.print("Nilai Tugas : ");
         tugas = input.nextInt();
         
         System.out.println("=======================================");
          
         System.out.print("Nilai Quiz : ");
         quiz = input.nextInt();
         
         System.out.println("=======================================");
          
         System.out.print("Nilai Uts : ");
         uts = input.nextInt();
         
         System.out.println("=======================================");
         
         System.out.print("Nilai Uas : ");
         uas = input.nextInt();
         
         System.out.println("=======================================");
         
         System.out.println("Nama Saya : " + nama);
         System.out.println("Nilai Quiz Saya : " + quiz);
         System.out.println("Nilai Uts Saya : " + uts);
         System.out.println("Nilai Uas Saya : " + uas);
         
         System.out.println("=======================================");
         
         nilaiAkhir = (tugas * 0.1) + (quiz * 0.2) + (uts * 0.3) + (uas * 0.4);
         System.out.println("Nilai Akhir : " + nilaiAkhir);
         
         System.out.println("=======================================");
         
         status = nilaiAkhir;
         if (status <= 69) {
            System.out.println("NILAI AKHIR " + nama + " DI BAWAH KKM"); 
         } else {
            System.out.println("SELAMAT " + nama + " KAMU LULUS"); 
         }
         
         System.out.println("=======================================");
    }
}