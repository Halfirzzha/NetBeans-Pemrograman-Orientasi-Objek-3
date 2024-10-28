/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.halfirzhadev.primaforloop;

/**
 *
 * @author halfirzzha
 */
public class PrimaForLoop {
    public static void main(String[] args) {
        System.out.println("Bilangan Prima 1-1000 menggunakan For Loop:");
        
        for(int i=2; i<=1000; i++) {
            boolean isPrime = true;
            
            for(int j=2; j<=i/2; j++) {
                if(i%j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if(isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
