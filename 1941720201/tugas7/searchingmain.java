/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas7;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class searchingmain {
    public static void main(String[] arrgs){
        int[] data = new int[5];
        int cari;
        Scanner andy = new Scanner (System.in);
        
        for(int i = 0; i<data.length;i++){
            System.out.print("Indeks ke-"+i+" : ");
            data[i] = andy.nextInt();
        }
        
        System.out.print("Masukan data yang ingin dicari: ");
        cari = andy.nextInt();
        
        searching pencarian = new searching(data,data.length);
        
        System.out.println("Isi Array: ");
        pencarian.tampilData();
        
        System.out.println("Menggunakan sequential Search");
        int posisi = pencarian.Findseqsearch(cari);
        
        if (posisi != -1){
            System.out.println("Data: "+cari+" ditemukan pada indeks "+posisi);
        }
        else{
            System.out.println("Data "+cari+" tidak ditemukan");
        }
        
        pencarian.tampilPosisi(cari, posisi);
        System.out.println("=============================");
        System.out.println("Menggunakan binary search");
        posisi = pencarian.FindBinarySearch(cari, 0, data.length-1);
        pencarian.tampilPosisi(cari, posisi);
        
    }
}

