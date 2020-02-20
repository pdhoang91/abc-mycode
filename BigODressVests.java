/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigo.day2.AlgorithmicComplexity;


import java.util.Scanner;
import java.util.ArrayList;
 
public class BigODressVests {
	static class Vest {
		int u, v;
 
		public Vest(int x , int y) {
			u = x; 
			v = y; 
		}
	}
 
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt(); 
		int m = sc.nextInt(); 
		int x = sc.nextInt(); 
		int y = sc.nextInt(); 
                
                
 
		ArrayList<Integer> a = new ArrayList<>(), b = new ArrayList<>();
 
		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
 
		for (int i = 0; i < m; i++) {
			b.add(sc.nextInt()); 
		}
 
		ArrayList<Vest> V = new ArrayList<>(); 
		int j = 0; 
 
		for (int i = 0; i < m; i++) {
			while (j < n && a.get(j) + y < b.get(i)) {
				j++; 
			}
 
			if (j == n) 
				break; 
 
			if (a.get(j) - x <= b.get(i) && a.get(j) + y >= b.get(i)) {
				V.add(new Vest(j + 1 , i + 1));
				j++; 
			}
		}
 
		System.out.println(V.size()); 
 
		for (Vest vest : V) {
			System.out.println(vest.u + " " + vest.v);
		}
	}	
}