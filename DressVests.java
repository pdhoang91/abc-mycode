
package bigo.day2.AlgorithmicComplexity;

import java.util.ArrayList;
import java.util.Scanner;


public class DressVests {
	public static void main(String[] args) {	

            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int m = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();

            int[] men = new int[n];
            for(int i = 0; i < n; i++) {
                men[i] = scan.nextInt();
            }

            int[] vests = new int[m];
            for(int j = 0; j < m; j++) {
                vests[j] = scan.nextInt();
            }

            int index1 = 0;
            int index2 = 0;
            ArrayList<Integer> res1 = new ArrayList<>();
            ArrayList<Integer> res2 = new ArrayList<>();

            while(index1 <= n-1 && index2 <= m-1) {
                    if(men[index1]-x <= vests[index2] && men[index1]+y >= vests[index2]) {
                            res1.add(index1+1);
                            res2.add(index2+1);
                            index1++;
                            index2++;
                    }
                    else if(men[index1]-x > vests[index2]) {
                            index2++;
                    }
                    else if(men[index1]+y < vests[index2]){
                            index1++;
                    }
            }
            System.out.println(res1.size());
            for(int k = 0; k < res1.size(); k++) {
                    System.out.println(res1.get(k)+" "+res2.get(k));
            }
	}
}
