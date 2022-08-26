/*
 *  input a number and converted into a single digit
 *      EX- 123= 1+2+3 = 6
 *          178= 1+7+8 = 16 = 1+6 = 7
 */

package singledigitconversion;

import java.util.Scanner;
public class SingleDigitConversion {
    public static void main(String[] args) {
        Scanner sn;
        sn=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sn.nextInt();
        int ans=0;
        int answer=0;

        do{
            int r=n%10;
            n=n/10;
            ans=ans+r;
        }while(n>0);
        if(ans>9){
            do{
                int r=ans%10;
                ans=ans/10;
                answer=answer+r;
            }while(ans>0);
        }
        System.out.print("Answer: "+answer);
        sn.close();
    }
}
