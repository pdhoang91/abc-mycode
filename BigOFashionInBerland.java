package bigo.day1.DymamicArrayAndString;

import java.util.Scanner; 
public class BigOFashionInBerland {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in); 
        int n = in.nextInt();
        if(n==1) {
            int temp = in.nextInt();
            if(temp==1) {
                System.out.print("YES");
                return;
            }
            else {
                System.out.print("NO");
                return;
            }
        }
        int count = 0, res = 1;
        //Nếu từ 2 chiếc  trở lên thì đếm xem số lượng chiếc nút không được cài lớn hơn 1 là NO ngược lại là YES
        for (int i=0; i<n; i++) {
            int temp = in.nextInt();
            if(temp==0)
                count++;
            if(count>1) {
                res = 0;
                break;
            }
        }
        if (res==1 && count==1)
            System.out.print("YES");
        else
            System.out.print("NO");
 
    }
}
