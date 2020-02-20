/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigo.day1.DymamicArrayAndString;

import java.util.Scanner;
import java.util.*;
 
public class BigOBigSegment {
	public static final int M = 100005;
	public static final int oo = 1000000007;
	public static int res = -1;
	public static int l[] = new int[M];
	public static int r[] = new int[M];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int left = oo;
		int right = 0;
 
                // cách này hay quá
                // lấy được giá trị left và right trong lúc input luôn
		for (int i = 0; i < n; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
			if (left > l[i])
				left = l[i];
			if (right < r[i])
				right = r[i];
		}
                // hay qua thay oi
		for (int i = 0; i<n; i++)
		if (left == l[i] && right == r[i])
		{
			res = i + 1;
			break;
		}
		System.out.print(res);
	}
}