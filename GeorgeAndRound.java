
package bigo.day2.AlgorithmicComplexity;

import java.util.Scanner;

public class GeorgeAndRound {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];

        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
                
        for(int i=0;i<m;i++) {
            b[i]=sc.nextInt();
        }
        int j=0;
        for(int i=0;i<m&&j<n;i++)
            {
                if(a[j]<=b[i]) {
                        j++;				
                }
            }
        System.out.println(n-j);
    }
}
