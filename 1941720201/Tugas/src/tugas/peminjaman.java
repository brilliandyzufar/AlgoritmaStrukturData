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
public class peminjaman {
static Scanner andy = new Scanner (System.in);
    public static void main (String [] args){
        
        peminjaman transaksi = new peminjaman();
        int totalHarga = transaksi.hargaTotal();
        int bayar = transaksi.hitungDiskon(totalHarga);
        transaksi.hitungHargaBayar(bayar);
    }

    public String Sepatu;
    public int hargaSatuan = 700000;
    public int jumlah, total;

    public int hargaTotal() {
        System.out.print("Masukan jumlah pembelian: ");
        jumlah = andy.nextInt();
        int total = jumlah * hargaSatuan;
        return total;
    }

    public int hitungDiskon(int total) {
        int bayar = 0;
        if (total > 700000) {
            System.out.println("Anda mendapatkan diskon 10 persen");
            bayar = total * 90 / 100;
        } else if (total > 100000) {
            System.out.println("Anda mendapatkan diskon sebesar 5%");
            bayar = total * 95 / 100;
        } else {
            System.out.println("Maaf, Anda tidak mendapatkan diskon");
        }
        return bayar;
    }

    public void hitungHargaBayar(int bayar) {
        System.out.println("Anda harus membayar uang sejumlah: " + bayar);
}
}
