/*
 *  Print the Fibonacci series
 *      0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...............
 */

package fibonacciseries;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sn;
        sn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sn.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+","+b);
        for(int x=0; x<n-2; x++){
            int ans=a+b;
            System.out.print(","+ans);
            a=b;
            b=ans;

        }
        sn.close();
    }
}
