/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas7;

/**
 *
 * @author Asus
 */
public class mainsort {
    public static void main(String[] args){
        int[] data = {10,40,30,50,70,20,100,90};
        System.out.println("Sorting dengan merge sort");
        mergesorting mSort = new mergesorting();
        System.out.println("Data awal");
        mSort.printArray(data);
        mSort.mergesort(data);
        System.out.println("Setelah di urutkan");
        mSort.printArray(data);
}
}