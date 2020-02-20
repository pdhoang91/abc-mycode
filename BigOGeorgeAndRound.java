/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigo.day2.AlgorithmicComplexity;


import java.util.Scanner;
import java.util.ArrayList;
 
public class BigOGeorgeAndRound {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>(), b = new ArrayList<Integer>();
 
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
 
        for (int i = 0; i < m; i++) {
            b.add(sc.nextInt());
        }
 
        int j = 0, count = 0;
 
        for (int i = 0; i < n; i++) {
            while (j < m) {
                if (b.get(j) >= a.get(i)) {
                    count++;
                    j++;
                    break;
                }
                else {
                    j++;
                }
            }
        }
 
        System.out.print(n - count);
    }
}