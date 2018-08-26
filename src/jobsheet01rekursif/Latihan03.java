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
public class Latihan03 {

public static void cetakAngka(int angka) {
        if (angka >= 1){
            System.out.print(angka +" ");
            cetakAngka(--angka);
        }
    }
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan sembarang angka : ");
        int a = masuk.nextInt();
        cetakAngka(a);
    }
}
