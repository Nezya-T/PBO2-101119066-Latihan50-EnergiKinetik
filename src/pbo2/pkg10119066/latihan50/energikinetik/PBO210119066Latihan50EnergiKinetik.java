/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10119066.latihan50.energikinetik;
import java.util.Scanner;

/**
 *
 * @author Neyza-T
 * Nama     : Nezya Tariska
 * Nim      : 10119066
 * Kelas    : IF2
 */
public class PBO210119066Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        EnergiKinetik ek = new EnergiKinetik();
        ek.setMassa(145);
        ek.setKecepatanakhir(25);
        ek.setKecepatanawal(0);
        System.out.println("=====Program Hitung Energi Kinetik=====");
        System.out.println("Massa \t\t: " + ek.getMassa() + " g");
        System.out.println("Kecepatan \t: " + ek.getKecepatanakhir() + " m/s");
        System.out.println(" ");
        System.out.println("Energi Kinetik \t: " + ek.hitungenergikinetik() + " joule");
        System.out.println("Usaha \t\t: " + ek.hitungusaha() + " joule");
        System.out.println("Dikarenakan tidak adanya perubahan kecepatan sehingga Usaha = Energi Kinetik ");
      
    }
    
}
