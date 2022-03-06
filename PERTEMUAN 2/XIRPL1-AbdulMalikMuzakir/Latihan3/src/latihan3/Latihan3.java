package latihan3;

import java.util.*;

public class Latihan3 {
    public static void main(String[] args) {
//        int a,b,c;
//        
//        Scanner input = new Scanner(System.in);
//        System.out.print("Masukan Angka Pertama : ");
//        a = input.nextInt();
//        System.out.print("Masukan Angka Kedua : ");
//        b = input.nextInt();
//        c = a + b;
//        System.out.println("Hasil : " + c);

String nama;
         int tugas, quiz, uts, uas, nilaiAkhir;
          
         Scanner input = new Scanner(System.in);
         System.out.println("========== REKAP NILAI SISWA ==========");
         System.out.print("Masukan Nama Siswa : ");
         nama = input.nextLine();
         System.out.println("Nama Saya : " + nama);
         
         System.out.print("Nilai Tugas : ");
         tugas = input.nextInt();
         System.out.println("Nama Saya : " + tugas);
          
         System.out.print("Nilai Quiz : ");
         quiz = input.nextInt();
         System.out.println("Nama Saya : " + quiz);
          
         System.out.print("Nilai Quiz : ");
         quiz = input.nextInt();
         System.out.println("Nama Saya : " + quiz);
         
         System.out.print("Nilai Uts : ");
         uts = input.nextInt();
         System.out.println("Nama Saya : " + uts);
         
         System.out.print("Nilai Uas : ");
         uas = input.nextInt();
         System.out.println("Nama Saya : " + uas);
         
         nilaiAkhir = tugas + quiz + uts + uas;
         System.out.println("Nama Akhir : " + nilaiAkhir);
         
         System.out.println("10% TUGAS 20% QUIZ 30% UTS 40% UAS");
    }
}