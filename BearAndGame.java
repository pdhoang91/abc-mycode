package bigo.day1.DymamicArrayAndString;

import java.util.Scanner;

// https://codeforces.com/problemset/problem/673/A?fbclid=IwAR1qL9Fsijnnl6p9NnxtItoDCVAVPcokI70aSW-dPgpqbQyZ7Cd8Y_WnTZ0

// ý tưởng của mình là. Tại mỗi lần nhập các thời gian thú vị mình sẽ kiểm tra xem
// cái thời gian đó với thời gian lần trước có khoảng cách lớn hơn 15 không. Nếu
// nó khoảng cách đó lớn hơn 15 sẽ cho tổng thời gian xem bằng thời gian hiện tại. 
// không cần cộng thêm 15 nữa.

// cach giai cua tro giang
// b1: doc n
// b2: dua o vao a
//-- doc du lieu vao a
//-- dua 90 vao a q
//(for i -> n )
//t(i+1) - ti > 15 => ti+15 dung ct
// in 90



public class BearAndGame {
    
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

            int inputNumber = in.nextInt();

            int sum = 0;

            for(int i = 0; i < inputNumber; i++){

                int currentTime = in.nextInt() ;

                if(sum + 15 >= currentTime) {

                    sum = currentTime ;
                }
            }

            sum += 15;

            System.out.println(sum > 90 ? 90 : sum);
    }
}