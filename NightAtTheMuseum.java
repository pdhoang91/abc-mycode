// https://codeforces.com/problemset/problem/731/A?fbclid=IwAR2Oml95yDMNYEpvu-WvRqByrgy-yZIJa2_Vm9mr_Y_okjwjxY1ThSC8sWM
package bigo.day1.DymamicArrayAndString;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NightAtTheMuseum {

    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

        char arr[] = br.readLine().toCharArray();

        char poited = 'a';

        int shortestPath = 0;

        for(int i = 0; i < arr.length; i++) {

            if(Math.abs(arr[i] - poited) > 13) {

                shortestPath += (26 - Math.abs(arr[i] - poited));
            } else {

                shortestPath += Math.abs(arr[i] - poited);
            }

            poited = arr[i];
        }

        System.out.println(shortestPath);
    } 
}