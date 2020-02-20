/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigo.day2.AlgorithmicComplexity;

import java.util.Scanner;
import java.util.ArrayList;
 
public class BigOArray {
	public static final int MAX = (int)1e5 + 5;
	public static int c[] = new int[MAX];
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		a.add(0);
 
		for (int i = 1; i <= n; i++) {
			a.add(sc.nextInt());
		}
 
		int j = 0, count = 0;
 
		for (int i = 1; i <= n; i++) {
			c[a.get(i)]++;
 
			if (c[a.get(i)] == 1)
				count++;
 
			while (count == k) {
				j++;
				c[a.get(j)]--;
 
				if (c[a.get(j)] == 0) {
					System.out.print(j + " " + i); 
					return;
				}
			}
		}
 
		System.out.print("-1 -1");
	}
}