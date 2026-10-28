
package Lat;

import java.util.Scanner;

public class Persegi extends BangunDatar{
     Scanner input = new Scanner(System.in);
    int sisi;
    
     @Override
    public void luas(){
        System.out.print("Sisi : ");
        sisi = input.nextInt();
        System.out.println("============");
        System.out.print("Persegi ");
        int hasil = sisi * sisi;
        System.out.println("Hasil luas : " +hasil);
    }
     @Override
    public void keliling(){
        System.out.println("============");
        System.out.println("Keliling persegi");
        int hasil = sisi * 4;
        System.out.println("Hasil keliling : " + hasil);
    }
}
