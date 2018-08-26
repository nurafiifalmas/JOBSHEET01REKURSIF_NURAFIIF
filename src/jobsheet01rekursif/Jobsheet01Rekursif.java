/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet01rekursif;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Jobsheet01Rekursif {
    public static void cetak(int a){
    
    if (a>0)
    {
        System.out.println("Hai ");
        cetak(--a);
        
    }
    }
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Masukkan jumlah teks yang ingin dicetak : ");
       int jumlah = scanner.nextInt();
       cetak(jumlah);
    }
    
}
