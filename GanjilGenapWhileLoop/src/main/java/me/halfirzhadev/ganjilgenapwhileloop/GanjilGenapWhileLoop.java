/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.halfirzhadev.ganjilgenapwhileloop;

/**
 *
 * @author halfirzzha
 */
public class GanjilGenapWhileLoop {
    public static void main(String[] args) {
        System.out.println("Bilangan Ganjil dan Genap 1-1000 menggunakan While Loop:");
        
        System.out.println("\nBilangan Genap:");
        int i = 1;
        while(i <= 1000) {
            if(i%2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        
        System.out.println("\n\nBilangan Ganjil:");
        i = 1;
        while(i <= 1000) {
            if(i%2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}