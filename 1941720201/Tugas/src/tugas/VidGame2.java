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
public class VidGame2 {
     public static void main(String[] args) {
        Scanner andy = new Scanner(System.in);
        Scanner fikar = new Scanner(System.in);
        VidGame1 b = new VidGame1();
        
        System.out.println("Masukan ID : ");
        b.id = andy.nextInt();
        System.out.println("Masukan Nama : ");
        b.nama = fikar.nextLine();
        System.out.println("Masukan Nama game");
        b.game = fikar.nextLine();
        System.out.println("Masukan waktu peminjaman : ");
        b.lamaPinjam = fikar.nextInt();
        System.out.println("Masukan harga sewa : ");
        b.harga = andy.nextInt();
        System.out.println("=================================================");
        b.dataPeminjaman();
        b.jumlahTotal();
    }   
}
