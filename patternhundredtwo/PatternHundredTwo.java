/*
    Print the following pattern:-
        1 2 
        2 4 
        3 6 
*/

package patternhundredtwo;

public class PatternHundredTwo {
    public static void main(String[] args) {
        for(int i=1; i<=3; i++){
            int a=i;
            for(int j=1; j<=2;j++){
                System.out.print(a+" ");
                a=a*2;
            }
            System.out.println();
        }
    }
}
