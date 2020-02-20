package bigo.day1.DymamicArrayAndString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// tìm chuỗi nằm giữa 2 chuỗi.
// ví dụ 125 < 128. thì sẽ lấy 125+ 1 so sánh với 128
// => nên duyệt từ cuối chuỗi( duyệt ngược)
// nếu kỹ tự cuối cùng là z thì gán cho nó là a




public class VitalyAndStrings {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] cc = br.readLine().toCharArray();

        String t = br.readLine();

        for (int i = cc.length - 1; i >= 0; i--) {

            if (cc[i] == 'z') {

                cc[i] = 'a';
            } else {

                cc[i]++;

                break;
            }
        }

        System.out.println(new String(cc).equals(t) ? "No such string" : new String(cc));

    }
}
