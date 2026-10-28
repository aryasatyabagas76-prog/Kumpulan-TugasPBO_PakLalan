/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pak.lalan;

import java.util.Scanner;

/**
 *
 * @author bagas
 */
public class no3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jam, menit, detik, totaldetik;
        
        System.out.println("Masukan jam : ");
        jam = input.nextInt();
        
        System.out.println("Masukan Menit : ");
        menit = input.nextInt();
        
        System.out.println("Masukan detik : ");
        detik = input.nextInt();
        
        totaldetik = jam * 3600 + menit * 60 + detik;
        
        System.out.println("Total detik = " + totaldetik);
    }
    
}
