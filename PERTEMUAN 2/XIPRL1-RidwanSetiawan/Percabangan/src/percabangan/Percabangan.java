package percabangan;

/**
 * 
 Authour By Silfren And Abdul And Ridwan
 14/02/2022
 PBO
 * 
 */
public class Percabangan {
    public static void main(String[] args) {
        
        double tugas = 70, quiz = 80, uts = 100, uas = 100, akhir; 
        char index;
        String status;
        
        akhir = (0.1 * tugas) + (quiz * 0.2) + (0.3 * uts) + (0.4 * uas);
        
        if (akhir >= 91) {
            index = 'A';
        } else if (akhir >= 81) {
            index = 'B';
        } else if (akhir >= 71) {
            index = 'C';
        } else if (akhir >= 61) {
            index = 'D';
        } else {
            index = 'E';
        }
        
        status = (akhir >= 71) ? "SELAMAT ANDA LULUS" : "MAAF ANDA GAGAL";
        
        System.out.println("==============================");
        System.out.println("Nilai tugas : " + tugas);
        System.out.println("Nilai quiz : " + quiz);
        System.out.println("Nilai uts : " + uts);
        System.out.println("Nilai uas : " + uas);
        System.out.println("==============================");
        
        System.out.println("==============================");
        System.out.println("Nilai akhir : " + akhir);
        System.out.println("Status : " + status);
        System.out.println("Nilai akhir : " + index);
        System.out.println("==============================");
        
    }
    
}
