/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.halfirzhadev.primadowhileloop;

/**
 *
 * @author halfirzzha
 */
public class PrimaDoWhileLoop {
    public static void main(String[] args) {
        System.out.println("Bilangan Prima 1-1000 menggunakan Do-While Loop:");
        
        int i = 2;
        do {
            boolean isPrime = true;
            int j = 2;
            
            do {
                if(i%j == 0) {
                    isPrime = false;
                    break;
                }
                j++;
            } while(j <= i/2);
            
            if(isPrime) {
                System.out.print(i + " ");
            }
            i++;
        } while(i <= 1000);
    }
}
