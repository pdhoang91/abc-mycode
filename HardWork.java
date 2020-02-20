package bigo.day2.AlgorithmicComplexity;

import java.util.ArrayList;
import java.util.Scanner;

public class HardWork {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next().toLowerCase().replace("-", "").replace(";","").replace("_", "");
        String b = sc.next().toLowerCase().replace("-", "").replace(";","").replace("_", "");
        String c = sc.next().toLowerCase().replace("-", "").replace(";","").replace("_", "");
        
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();
        
        arr.add(a + b +c );
        arr.add(a + c +b );
        arr.add(b + a +c );
        arr.add(b + c +a );
        arr.add(c + a +b );
        arr.add(c + b +a );
        
        int n = sc.nextInt();
        for(int i =0; i<n;i++){
            String s =  sc.next().toLowerCase().replace("-", "").replace(";","").replace("_", "");
            arr2.add(s);
        }
        
        for(int i =0; i<n; i++){
            if(arr.contains(arr2.get(i))) {
                System.out.println("ACC");
            } else {
                System.out.println("WA");
            }
        }
    }
}
