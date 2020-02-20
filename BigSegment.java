package bigo.day1.DymamicArrayAndString;

import java.util.Scanner;

public class BigSegment {

  // Ý tưởng của bài này là. Mình sẽ giả sử đoạn đầu tiên là đoạn bao toàn bộ các đoạn khác.
  // Sau đó mình sẽ tìm 
  public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int minLeft = scanner.nextInt();

        int maxRight = scanner.nextInt();

        int left, right, outPut = 1;

        for(int i = 2; i <= n; i++) {

            left = scanner.nextInt();

            right = scanner.nextInt();

            if(left <= minLeft && right >= maxRight) {

                outPut = i;

            } else if (left < minLeft || right > maxRight){

                outPut = -1;
            } 

            minLeft = Math.min(minLeft, left);

            maxRight = Math.max(maxRight, right);

         }

        System.out.print(outPut);

    }
}
