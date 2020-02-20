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
public class Pacman2 {
     public static void main(String[] args) {
        Scanner andy = new Scanner(System.in);
        Pacman1 c = new Pacman1();
        System.out.print("Masukkan koordinat x: ");
        c.x = andy.nextInt();
        System.out.print("Masukkan koordinat y:  ");
        c.y = andy.nextInt();
        System.out.print("Masukkan width: ");
        c.width = andy.nextInt();
        System.out.print("Masukkan height: ");
        c.height = andy.nextInt();
        
        c.moveLeft();
        c.moveRight();
        c.moveUp();
        c.moveDown();
    }  
}
