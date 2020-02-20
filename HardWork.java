package bigo.day1.DymamicArrayAndString;

import java.util.Scanner;
import java.util.ArrayList;

public class HardWork {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String a = scanner.next().toLowerCase().replaceAll("[-_;]", "");
        String b = scanner.next().toLowerCase().replaceAll("[-_;]", "");
        String c = scanner.next().toLowerCase().replaceAll("[-_;]", "");

        ArrayList<String> arr = new ArrayList<>();
        arr.add(a + b + c);
        arr.add(a + c + b);
        arr.add(b + a + c);
        arr.add(b + c + a);
        arr.add(c + a + b);
        arr.add(c + b + a);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            String s = scanner.next().toLowerCase().replaceAll("[-_;]", "");

            if (arr.contains(s)) {

                System.out.println("ACC");
            } else {

                System.out.println("WA");
            }
        }
    }
}