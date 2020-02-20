/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigo.day1.DymamicArrayAndString;

import java.util.Arrays;
import java.util.Scanner;

 
public class BigOVitalyAndStrings {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        char s[] = sc.next().toCharArray();
        char t[] = sc.next().toCharArray();
 
        for (int i = s.length - 1; i >= 0; i--) {
            if (s[i] == 'z') {
                s[i] = 'a';
            }
            else {
                s[i]++;
                break;
            }
        }
 
        System.out.print(Arrays.equals(s, t) ? "No such string".toCharArray() : s);
    }
}