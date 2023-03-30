/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package moneylovertestq1;
import java.util.*;


/**
 *
 * @author T490
 */
public class MoneyLoverTestQ1 {

    // Topic: Cho dãy số tự nhiên A. Cài đặt chương trình sắp xếp dãy số A từ nhỏ đến lớn và loại bỏ số không phải là số nguyên tố.
    public static void main(String[] args) {
        //Generate a sequence of natural numbers A
        List<Integer> A = new ArrayList<Integer>();
        A.add(7);
        A.add(3);
        A.add(9);
        A.add(2);
        A.add(11);
        A.add(5);
        A.add(4);
        
        //sort A
        Collections.sort(A);
        
        //Remove numbers of A that are not primes
        removeNonPrimeNum(A);
   
    }

    //Remove numbers of A that are not primes
    public static void removeNonPrimeNum(List<Integer> A){
        for (int i = 0; i < A.size(); i++) {
            if (!isPrime(A.get(i))) {
                A.remove(i);
            }
        }
        
        System.out.print("A after being sorted from smallest to largest and eliminating non-prime numbers: ");
        for (int i = 0; i < A.size(); i++) {    
                System.out.print(A.get(i) + " ");   
        }
    }
    
    //Check prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
