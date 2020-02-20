/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigo.day2.AlgorithmicComplexity;


import java.util.Scanner;
import java.util.ArrayList;
 
public class BigOBooks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
 
		int j = 0;
		int books = 0, count = 0; 
 
		for (int i = 0; i < n; i++) { 
			a.add(sc.nextInt());
 
			while (t < a.get(i)) { 
				t += a.get(j);
				j++;
				count--;
			}
 
			t-= a.get(i);
			count++;
 
			books = Math.max(books, count);
		}
 
		System.out.print(books);
	}
}