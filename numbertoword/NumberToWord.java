/*
 * Convert a number to word
 */

package numbertoword;

import java.util.Scanner;
public class NumberToWord {
    static int sum(int x, int y){
        return x+y;
    }
    public static void main(String[] args) {
        Scanner sn;
        sn=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x=sn.nextInt();
        System.out.print(sum(10,18));
        sn.close();

    }
}
