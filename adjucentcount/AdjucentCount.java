package adjucentcount;

import java.util.Scanner;



public class AdjucentCount {

    static int getAllCount(int[] arr,int x){
        int count=0;
        int l=arr.length;
        for(int i=0; i<l;i++){
            if(arr[i]>=x)
                continue;            
            for(int j=i+1;j<l;j++){
                if(x==arr[i]+arr[j]){
                    count++;
                }
            }
        }
        return count;
    }

    static int getCount(int[] arr, int x){
        int count=0;
        int l=arr.length;
        for(int i=1; i<l;i++){
            if(x==arr[i-1]+arr[i]){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int[] arr=new int[10];
        System.out.println("Enter the array value: ");
        for(int i=0; i<10; i++){
            arr[i]=sn.nextInt(); 
        }
        System.out.println("Enter a number");        
        int a=sn.nextInt();
        int count=getAllCount(arr,a);
        System.out.println(arr);
        System.out.println(count);
        sn.close();
    }
    
}
