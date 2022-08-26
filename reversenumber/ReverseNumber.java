/*
 *  print the reverse number
 *    EX-  123 -> 321
 */


package reversenumber;

import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sn;
        sn=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x=sn.nextInt();        
        int ans=0;        
        do{
            int r=x%10;
            x=x/10;
            ans=ans*10+r;
        }while(x>0);
        System.out.print("Reverse number is: "+ans);
        sn.close();
    }
}
