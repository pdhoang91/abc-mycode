
package bigo.day2.AlgorithmicComplexity;

import java.util.Scanner;

public class AppConstantRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) A[i] = scanner.nextInt();
        int latest = A[0];
        int latestFrom = 0;
        int pre = A[0];
        int from = 0;
        int maxCnt = 0;
        for (int i = 1; i < n; i++) {
            if (latest == A[i]) continue;
            if (pre != A[i]) {
                maxCnt = Math.max(maxCnt, i - from);
                from = Math.abs(latest - A[i]) == 1 ? latestFrom : i;
            }
            pre = latest;
            latest = A[i];
            latestFrom = i;
        }
        System.out.println(Math.max(maxCnt, n - from));
    }
}
