
package Lat;

import java.util.Scanner;

public class Segitiga extends BangunDatar{
    Scanner input = new Scanner(System.in);
    double alas;
    double tinggi;
            
    @Override
    public void luas(){
        System.out.print("alas : ");
        alas = input.nextDouble();
        System.out.print("tinggi : ");
        tinggi = input.nextDouble();
        System.out.println("============");
        System.out.println("Luas segitiga");
        double hasil = 0.5 * alas * tinggi;
        System.out.println("Hasil luas : " + hasil);
    }
    @Override
    public void keliling(){
        System.out.println("============");
        System.out.println("Keliling Segitiga");
        double hasil = 3 * alas;
        System.out.println("Hasil keliling : " + hasil);
    }
}
