/*
 *  Print the Fibonacci series
 *      0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...............
 */

package fibonacciseries;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sn;
        int x=0;
        int y=1;
        sn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sn.nextInt();
        for(int i=1;i<=n;i++)
        {
           x+=y;
           y=x-y;
           System.out.print(y+", ");
        }
        sn.close();
    }
}
