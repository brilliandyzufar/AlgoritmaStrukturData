/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu5;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Main {

    public static void main(String[] args) {
        Scanner andy = new Scanner(System.in);
        Scanner zufar = new Scanner(System.in);
        DaftarMahasiswaBerprestasi data = new DaftarMahasiswaBerprestasi();
        int jumMhs = 5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Nama = ");
            String nama = zufar.nextLine();
            System.out.println("Thn masuk = ");
            int thn = andy.nextInt();
            System.out.println("Umur = ");
            int umur = andy.nextInt();
            System.out.println("IPK = ");
            double ipk = andy.nextDouble();

            Mahasiswa m = new Mahasiswa(nama, thn, umur, ipk);
            data.tambah(m);

        }

        System.out.println("Data Setelah Di Insertion Sort = ");
//            data.insertSort();
        data.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasar ipk= ");
        data.selectionSort();
        data.tampil();
        System.out.println("Data mahasiswa sebelum sorting = ");
        data.tampil();
        System.out.println("Data mahasiswa setelah sorting desc berdasar ipk= ");
        data.bubbleSort();
        data.tampil();
    }
}
