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
public class jajargenjang {
    public int alas, tinggi;
    
    public int luas(){
    int luas = alas * tinggi;
    return luas;
}
    public int keliling(){
        int keliling = 2 * (alas + tinggi);
        return keliling;
    }
    public static void main(String[] args) {
        Scanner andy = new Scanner(System.in);
        jajargenjang[] jgenjang = new jajargenjang[5];

        for (int i = 0; i < 5; i++) {
           jgenjang[i] = new jajargenjang();
            System.out.println("Jajar genjang ke-" + (i + 1));
            System.out.print("Masukkan alas     : ");
            jgenjang[i].alas = andy.nextInt();
            System.out.print("Masukkan tinggi   : ");
            jgenjang[i].tinggi = andy.nextInt();
            System.out.println("------------------");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Jajar genjang ke-" + (i + 1));
            System.out.println("Luasnya adalah: " + jgenjang[i].luas() + ", kelilingnya adalah: " +jgenjang[i].keliling());
        }
    }
}