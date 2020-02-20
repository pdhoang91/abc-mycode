/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigo.day2.AlgorithmicComplexity;

import java.util.Scanner;

/**
 *
 * @author macintosh
 */
public class SerejaAndDima {
    	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		int sum = 0;
		for(int x = 0 ; x < n ; x++){
			arr[x] = in.nextInt();
			sum += arr[x];
		}
		
		int r = 0;
		int l = n-1;
		int ans = 0;
		boolean turn = true;
		while(r <=l){
			if(arr[r] > arr[l])
			{
				if(turn)
				ans += arr[r];
				r++;
			}else{
				if(turn)
				ans += arr[l];
				l--;
			}
			turn = !turn;
		}
		System.out.println(ans + " " + (sum - ans));

	}
}
