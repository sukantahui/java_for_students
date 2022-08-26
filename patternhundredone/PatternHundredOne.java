package patternhundredone;

/*
    Print this Pattern :-
        0
        10
        210
        3210
*/
public class PatternHundredOne {
    public static void main(String[] args) {
        for(int i=0; i<4; i++){
            for(int j=i; j>=0; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
