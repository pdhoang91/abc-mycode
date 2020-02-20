
// https://codeforces.com/problemset/problem/224/B?fbclid=IwAR2YmdR8XWgFYwcXE8ZedLQTCsbqx-Fil2ztx5x5kdHMTXJgWWMlRguOEoU
package bigo.day2.AlgorithmicComplexity;

import java.util.ArrayList;
import java.util.Scanner;


//cnt=[0.0.0]
//
//l=r=1;
//count =0;
//
//while(r <=n){
//	cnt[a[i]]+=1;
//
//	if(cnt[a[i]] ==1) {
//	count +=1;
//	}
//	 if(count ==k){
//
//	 	while(l<r){
//	 		count[a(l) -= 1]
//
//	 		if(cnt[a(l)] ==0) {
//	 		out l,r;
//	 		retur;
//	 		}
//	 		l+=1;
//	 	}
//	 }
//}

// two pointers

public class Array {
    
    public static void main(String[] args){
   
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
       ArrayList<Integer> arr = new ArrayList<>();

       
        for(int i = 1; i <= n; i++){
            int temp = scanner.nextInt();     
            arr.add(temp);
        }
        System.out.println(arr);
        
       int minLeft = arr.get(0);
       int maxRight = arr.get(0);
        
        for( int i = 2; i < arr.size(); i++){
             minLeft = arr.get(1);
             maxRight = arr.get(arr.size() -1);
            if(minLeft == arr.get(i)) {
                minLeft = arr.get(i);
            }
            if(maxRight == arr.get(i)) {
                maxRight = arr.get(i);
            }
        }
                

        System.out.print(minLeft);
        System.out.print(maxRight);

    }
}
