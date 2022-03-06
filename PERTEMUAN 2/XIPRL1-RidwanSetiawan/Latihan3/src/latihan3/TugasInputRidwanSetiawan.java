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
         System.out.println("=======================================");
         System.out.println("========== REKAP NILAI SISWA ==========");
         System.out.println("=======================================");
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
         System.out.println("Nilai Tugas Saya : " + tugas);
         System.out.println("Nilai Quiz Saya : " + quiz);
         System.out.println("Nilai Uts Saya : " + uts);
         System.out.println("Nilai Uas Saya : " + uas);
         
         System.out.println("=======================================");
         
         nilaiAkhir = (tugas * 0.1) + (quiz * 0.2) + (uts * 0.3) + (uas * 0.4);
         System.out.println("Nilai Akhir : " + nilaiAkhir);
         
         System.out.println("=======================================");
         
         System.out.println("=======================================");
         
         System.out.print("Sekor " + nama + " : ");
         if (nilaiAkhir >= 91) {
             System.out.println("A");
         }
         else if (nilaiAkhir >= 81) {
             System.out.println("B");
         }
         else if (nilaiAkhir >= 71) {
             System.out.println("C");
         }
         else if(nilaiAkhir >= 61) {
             System.out.println("D");
         }
         else {
             System.out.println("E");
         }
         
         System.out.println("=======================================");
         
         status = nilaiAkhir;
         if (status >= 70) {
            System.out.println("SELAMAT " + nama + " KAMU LULUS"); 
         } else {
            System.out.println("MAAF " + nama + " NILAI KAMU DI BAWAH KKM"); 
         }
         
         System.out.println("=======================================");
    }
}