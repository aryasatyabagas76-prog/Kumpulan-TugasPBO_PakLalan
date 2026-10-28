/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.pak.lalan;

import java.util.Scanner;

/**
 *
 * @author bagas
 */
public class TugasPakLalan {
    public static void main(String[] args) {
        int tahun;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Tahun Berapakah Sekarang?");
        tahun = input.nextInt();
        
        if(tahun % 400 == 0 || (tahun % 4 == 0 && tahun % 100 != 0)) {
            System.out.println(tahun + " adalah tahun kabisat");
        }
        else
        {
            System.out.println(tahun + " bukan tahun kabisat");
        }    
        }
    }
    
