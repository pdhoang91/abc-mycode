package bigo.day1.DymamicArrayAndString;

import java.util.*;
import java.lang.*;
import java.io.*;
 
public class BigONightAtTheMuseum
{
	static PrintWriter out;
 
	public static void main (String[] args) throws java.lang.Exception
	{
		MyScanner in = new MyScanner();
		out = new PrintWriter(new BufferedOutputStream(System.out), true);
 
		String wheel;
		char ch = 'a';
		wheel = in.nextLine();
		int count = 0;
		int m = 0;
		for (int i = 0; i < wheel.length(); i++) {
			m = Math.abs(ch - wheel.charAt(i));
			if (m < 13)
				count = count + m;
			else
				count = count + 26 - m;
			ch = wheel.charAt(i);
		}
		out.printf("%d", count);
	}
 
	public static class MyScanner {
		BufferedReader br;
		StringTokenizer st;
 
		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}