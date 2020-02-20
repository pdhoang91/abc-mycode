// https://codeforces.com/problemset/problem/691/A?fbclid=IwAR2PGRxKQMi0daRoXOqL0YCGUcQJr0QfSm6vfJhUmw-0UXAg9YlT4xgHtCI

package bigo.day1.DymamicArrayAndString;

import java.util.Scanner;

public class FashionInBerland {

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       boolean isZero = false;

       for(int i = 0; i < number; i++) {

            int input = sc.nextInt();

            if(input == 0 && !isZero){

                isZero = true;
            } else if (input == 0){

                System.out.println("NO"); 
                return;
            }
        }
       
        if (number == 1) {

            isZero = !isZero;
        }
        if (!isZero) {

            System.out.println("NO"); 
            return;
        }

        System.out.println("YES"); 
    
    } 
}
