/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.halfirzhadev.ganjilgenapdowhileloop;

/**
 *
 * @author halfirzzha
 */
public class GanjilGenapDoWhileLoop {
    public static void main(String[] args) {
        System.out.println("Bilangan Ganjil dan Genap 1-1000 menggunakan Do-While Loop:");
        
        System.out.println("\nBilangan Genap:");
        int i = 1;
        do {
            if(i%2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while(i <= 1000);
        
        System.out.println("\n\nBilangan Ganjil:");
        i = 1;
        do {
            if(i%2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        } while(i <= 1000);
    }
}