/*
 *  Check the number if it is a prime number
 *  -----Like 13 is a Prime number because it only divisible by two number, 1 & 13
 */


package primenumber;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sn;
        sn = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter a number : ");
        int x = sn.nextInt();
        for(int i=1; i<=x; i++){
            if(x%i==0){
                count++;
            }
        }
        if(count<=2){
            System.out.print(x +" is a prime number");
        }
        sn.close();
    }
}
