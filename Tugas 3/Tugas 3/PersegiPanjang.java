
package Lat;

import java.util.Scanner;


public class PersegiPanjang extends BangunDatar{
     Scanner input = new Scanner(System.in);
    int p;
    int l;
            
     @Override
    public void luas(){
        System.out.print("Panjang : ");
        p = input.nextInt();
        System.out.print("lebar   : ");
        l = input.nextInt();
        System.out.println("============");
        System.out.println("Luas Persegi Panjang");
        int hasil = p * l;
        System.out.println("Hasil luas : " + hasil);
    }
     @Override
    public void keliling(){
        System.out.println("============");
        System.out.println("Keliling persegi panjang");
        int hasil = 2 * (p + l);
        System.out.println("Hasil keliling : " +hasil);
    }
}
