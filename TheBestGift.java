
package bigo.day2.AlgorithmicComplexity;

import java.util.ArrayList;
import java.util.Scanner;

public class TheBestGift {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int inputNumber = in.nextInt();
        int kindNumber = in.nextInt();
        
        ArrayList arr = new ArrayList<>();
        
        
        
        
        //int[] a = new int[kindNumber];
        int result = 0;

        for (int i = 0; i < inputNumber; ++i) {
            int temp = in.nextInt();
            arr.add(temp);

        }
        
        System.out.println(arr);
       

        for (int i = 0; i < kindNumber; ++i) {

            for(int j = i+1; j < kindNumber; ++j) {

                //result += a[i]*a[j];
            }
        }
        System.out.println(result);
    }
}
