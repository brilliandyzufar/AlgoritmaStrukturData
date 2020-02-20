/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class lingkaranMain {
    public static void main (String [] args){
        Scanner andy = new Scanner (System.in);
        lingkaran a = new lingkaran ();
        
        System.out.println("masukkan jari_jari : ");
        a.r = andy.nextDouble();
        
        System.out.println("luas : " + a.hitungluas());
        System.out.println("keliling : " + a.hitungkeliling());
    }
}
