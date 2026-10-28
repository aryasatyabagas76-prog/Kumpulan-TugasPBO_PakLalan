/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

import java.util.Scanner;

public class Basikal {
    int jarak_tempuh;
    String merk;
    int pilihan;
    
    void melaju() {
        jarak_tempuh += 10;
        System.out.println("Object Sepeda " + merk + " Jarak tempuh " + jarak_tempuh + " Km\n");
    }
    
    void mundur() {
        jarak_tempuh -= 5;
        System.out.println("Object Sepeda " + merk + " Jarak tempuh " + jarak_tempuh + " Km\n");
    }
    
    void berhenti() {
        System.out.println("Jarak Tempuh Akhir Jarak tempuh : " + jarak_tempuh + " Km\n");
        
    }
    void info(){
        System.out.println("Terimakasih sudah menggunakan program ini");
    }
    
    void menu() {
            Scanner input = new Scanner(System.in);
            do{            
            System.out.println("1. Bergerak Maju");
            System.out.println("2. Bergerak Mundur");
            System.out.println("3. Sepeda Berhenti");
            System.out.println("0. Keluar Program..");
            System.out.print("Pilih Opsi : ");
            pilihan = input.nextInt();
            
            
            switch (pilihan) {
            case 0: 
                    System.out.println("Keluar Program...");
                    info();
                    break;
            case 1:
                    System.out.println("\nBergerak Maju 10 km");
                    melaju();
                    break;
            case 2:
                    System.out.println("\nBergerak Mundur 5 km");
                    mundur();
                    break;
            case 3:
                    System.out.println("\nSepeda Berhenti");
                    berhenti();
                    break;
                    
                 
            }
            }while (pilihan != 0);
            
            
            
        
    
    } 
    
    
}
