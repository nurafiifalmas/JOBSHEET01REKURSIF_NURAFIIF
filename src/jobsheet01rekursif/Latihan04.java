/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet01rekursif;

public class Latihan04 {
    static int Jumlah(int a)  {
        if (a == 1)
         return 1;   
        else
            return (a + Jumlah (a-1));
    
    }
    public static void main(String[] args) {
        int hasil ;
        int nomer = 10;
        hasil = Jumlah(nomer);
        System.out.println("Jumlah dari 1 - "+nomer+" adalah : "+hasil);
    }
 
}
