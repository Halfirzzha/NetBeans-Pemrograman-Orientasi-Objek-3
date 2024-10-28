/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.halfirzhadev.ganjilgenapforloop;

/**
 *
 * @author halfirzzha
 */
public class GanjilGenapForLoop {
    public static void main(String[] args) {
        System.out.println("Bilangan Ganjil dan Genap 1-1000 menggunakan For Loop:");
        
        System.out.println("\nBilangan Genap:");
        for(int i=1; i<=1000; i++) {
            if(i%2 == 0) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println("\n\nBilangan Ganjil:");
        for(int i=1; i<=1000; i++) {
            if(i%2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}