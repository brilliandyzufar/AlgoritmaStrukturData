/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algostrudat;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class MainSum {
    public static void main (String[] args){
    Scanner andy = new Scanner(System.in);
    
        System.out.println("=======================================================");
        System.out.println("Program menghitung keuntungan total (Satuan juta. Misal 5.9)");
        System.out.println("masukan jumlah bulan : ");
        int elm = andy.nextInt();
        
        Sum sm = new Sum(elm);
        System.out.println("=======================================================");
        for (int i = 0; i < sm.elemen; i++){
            System.out.print("masukan untung bulan ke - "+(i+1)+" = ");
            sm.keuntungan[i] = andy.nextDouble();
        }
        System.out.println("=======================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selema " + sm.elemen + "bulan adalah = "+sm.totalbf(sm.keuntungan));
        System.out.println("=======================================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = "+sm.totalDC(sm.keuntungan, 0, sm.elemen-1));
    }
}
