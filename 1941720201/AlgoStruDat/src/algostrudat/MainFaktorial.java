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
public class MainFaktorial {
    public static void main (String[] args){
    Scanner andy = new Scanner (System.in);    
        System.out.println("===================================================");
        System.out.print("masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = andy.nextInt();
    
    Faktorial [] fk = new Faktorial[elemen];
    for (int i = 0; i < elemen; i++){
        fk[i] = new Faktorial();
        System.out.print("masukan nilai data ke -"+(i+1)+" : ");
        fk[i].nilai = andy.nextInt();
    }
        System.out.println("====================================================");
        System.out.println("hsil faktorial dengan Brute Force");
        for (int i = 0; i < elemen; i++){
            System.out.println("faktorial dari nila "+fk[i].nilai+" adalah : "+fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("====================================================");
        System.out.println("hasil faktorial dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++){
            System.out.println("faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialDC(fk[i].nilai));
    }
        System.out.println("====================================================");
    }
}
    
