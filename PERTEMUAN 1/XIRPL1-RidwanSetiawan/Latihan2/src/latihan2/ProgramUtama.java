/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author Admin
 */
public class ProgramUtama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Siswa Siswa1 = new Siswa();
        Siswa Siswa2 = new Siswa();
        Siswa Siswa3 = new Siswa();
        
        Siswa1.insertData(1234567, "Abdul Malik Muzakir");
        Siswa2.insertData(7654321, "Ridwan Setiawan");
        Siswa3.insertData(5674123, "SilfRen Desta Longgi");
        
        System.out.println("============================");
        Siswa1.TampilData();
        System.out.println("============================");
        Siswa2.TampilData();
        System.out.println("============================");
        Siswa3.TampilData();
        System.out.println("============================");
    }
    
}
