
package bangunruang;

import java.util.Scanner ;

public class main {
    public static void main(String[] args){
         
        
        
        
        Scanner scanner = new Scanner (System.in);
         
         BangunRuang bangunRuang = new BangunRuang();
         
         Kubus kubus = new Kubus();
        System.out.print("Masukkan Panjang Rusuk Kubus (S): ");
        kubus.s = scanner.nextFloat();
        
        Balok balok = new Balok();
        System.out.print("Masukkan Panjang Balok: ");
        balok.p = scanner.nextFloat();
        System.out.print("Masukkan Lebar Balok: ");
        balok.l = scanner.nextFloat();
        System.out.print("Masukkan Tinggi Balok: ");
        balok.t = scanner.nextFloat();
        
        LimasSegitiga limassegitiga = new LimasSegitiga();
        System.out.print("Masukkan Alas Segiempat (a): ");
        limassegitiga.a = scanner.nextFloat();
        System.out.print("Masukkan  Tinggi Alas Segitiga Limas Segitiga (TS): ");
        limassegitiga.tS = scanner.nextFloat();
        System.out.print("Masukkan Tinggi Sisi Tegak Limas Segitiga (T): ");
        limassegitiga.tL = scanner.nextFloat();
        System.out.print("Masukkan Tinggi Limas Segiempat (t): ");
        limassegitiga.tST = scanner.nextFloat();
        
        Bola bola = new Bola();
        
        System.out.println("=================================");
        bangunRuang.luaspermukaan();
        kubus.luaspermukaan();
        balok.luaspermukaan();
        limassegitiga.luaspermukaan();
        bola.luaspermukaan();
        
        System.out.println("=================================");
        
        bangunRuang.volume();
        kubus.volume();
        balok.volume();
        limassegitiga.volume();
        bola.volume();
        System.out.println("=================================");
     }

    
}
