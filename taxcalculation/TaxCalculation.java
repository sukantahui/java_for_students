package taxcalculation;
import java.util.Scanner;
public class TaxCalculation{
    public static void main(String[] args){
        Scanner sn;
        sn=new Scanner(System.in);
        System.out.print("Enter the salary of the Engineer :");
        int salary=sn.nextInt();
        double tax=0;        
        if(salary<=100000){
            tax=0;
        }
        else if(salary<=150000){
            tax=(salary-100000)*.1;
        }
        else if(salary<=250000){
            tax=5000+(salary-150000)*.2;
        }
        else
            tax=25000+(salary-250000)*.3;
        
        System.out.println("The income tax paid by him "+tax);
        sn.close();
    }
}