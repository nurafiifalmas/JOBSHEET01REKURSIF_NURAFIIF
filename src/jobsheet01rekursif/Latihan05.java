/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet01rekursif;

import java.util.Scanner;

 public class Latihan05 {

    static int factorial(int a)  {
        if (a == 1)
         return a;   
        else
            return (a * factorial (a-1));
    
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menghitung Factorial dengan Rekursif");
        System.out.print("\nMasukkan Bilangan : ");
        int fact = input.nextInt();
       
        fact = factorial(fact);
        System.out.println("Hasil  : "+fact);
    }           
}
