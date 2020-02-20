
package bigo.day1.DymamicArrayAndString;

import java.util.Scanner;

public class TheBestGift {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int inputNumber = in.nextInt();
        int kindNumber = in.nextInt();
        int[] a = new int[kindNumber];
        int result = 0;

        for (int i = 0; i < inputNumber; ++i) {
            a[in.nextInt() -1 ]++; 
        }

        for (int i = 0; i < kindNumber; ++i) {

            for(int j = i+1; j < kindNumber; ++j) {

                result += a[i]*a[j];
            }
        }
        System.out.println(result);
    }
}
