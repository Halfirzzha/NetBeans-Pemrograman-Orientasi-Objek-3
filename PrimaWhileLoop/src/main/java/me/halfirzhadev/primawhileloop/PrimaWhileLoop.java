/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.halfirzhadev.primawhileloop;

/**
 *
 * @author halfirzzha
 */
public class PrimaWhileLoop {
    public static void main(String[] args) {
        System.out.println("Bilangan Prima 1-1000 menggunakan While Loop:");
        
        int i = 2;
        while(i <= 1000) {
            boolean isPrime = true;
            int j = 2;
            
            while(j <= i/2) {
                if(i%j == 0) {
                    isPrime = false;
                    break;
                }
                j++;
            }
            
            if(isPrime) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}