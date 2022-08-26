/*
    Subtraction of two user input value
*/


package firstjavaprogram;

import java.util.Scanner;
public class FirstJavaProgram{
    public static void main(String[] args){
        
        Scanner sn ;
        sn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sn.nextInt();
        System.out.println("Enter another number");
        int y = sn.nextInt();
        int z = x-y;
        System.out.println("The answer is " + z);
        sn.close();
    }
}
