/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet01rekursif;
/**
 *
 * @author user
 */
public class Latihan02 {
     public static void cetak(int a){
    
    if (a>0)
    {
        System.out.println("SMK Telkom Malang");
        cetak(--a);
        
    }
    }
    public static void main(String[] args) {
       cetak(5);
}
    
}
