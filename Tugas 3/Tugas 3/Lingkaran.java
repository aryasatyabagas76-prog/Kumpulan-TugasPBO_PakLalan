
package Lat;

import java.util.Scanner;

public class Lingkaran extends BangunDatar{
    Scanner input = new Scanner(System.in);
    double jari;
    
    @Override
    public void luas(){
        System.out.print("Masukkan jari : ");
        jari = input.nextDouble();
        System.out.println("============");
        System.out.print("Luas lingkaran ");
        double hasil = 3.14 * (jari * jari);
        System.out.println("Hasil luas : " + hasil);
    }
    @Override
    public void keliling(){
        System.out.println("============");
        System.out.println("Keliling lingkaran");
        double hasil = 2 * 3.14 * jari;
        System.out.println("Hasil keliling : " + hasil);
    }
}
