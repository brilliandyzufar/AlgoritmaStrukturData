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
public class tanah2 {
    public static void main(String[] args) {
        Scanner andy = new Scanner(System.in);
        System.out.println("Masukkan jumlah tanah: ");
        int jml = andy.nextInt();
        tanah1 d[] = new tanah1[jml];
        
        for(int a=0; a<d.length; a++){
            System.out.print("tanah ke-"+(a+1));
            d[a] = new tanah1();
            System.out.print("Panjang: ");
            d[a].panjang = andy.nextInt();
            System.out.print("Lebar: ");
            d[a].lebar = andy.nextInt();
        }
        System.out.println();
        for(int a=0; a<d.length; a++){
            System.out.println("tanah ke-"+(a+1));
            System.out.println("Panjang: "+d[a].panjang);
            System.out.println("Lebar: "+d[a].lebar);
            System.out.println();
        }
        System.out.println();
        for(int a=0; a<d.length; a++){
            System.out.println("Luas tanah "+(a+1)+" : "+d[a].hitungLuasTanah());
        }
            System.out.println();
        for(int a=0; a<d.length; a++){
            int temp=0,tanah=0;
            System.out.println("Luas Tanah "+(a+1)+" : "+d[a].hitungLuasTanah());
            if(d[a].hitungLuasTanah() > temp){
                temp = d[a].hitungLuasTanah();
                tanah = a + 1;
            }
            System.out.println();
            System.out.println("Tanah Terluas: Tanah "+tanah);
        }
    }
            
    } 