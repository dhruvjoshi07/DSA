
//nested loop
/*APPROACH FOR PATTERNS=
 * lines(outer loop)
 * number of times(inner loop)
 * what to print"x"
 */

/*
//  STAR-PATTERN
public class patterns {
    public static void main(String[] args) {
        for(int line=1;line<=4;line++){
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/


/*
// INVERTED STAR PATTERN
public class patterns{
    public static void main(String[] args){
    int n=4; 
        for(int line=1;line<=4;line++){
            for(int star=1;star<=(n-line+1);star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
 */


/*
//  PRINT HALF-PYRAMID PATTERN
public class patterns{
    public static void main(String[] args) {
        for(int line=1;line<=4;line++){
            for(int num=1;num<=line;num++){
                System.out.print(num);
            }
        System.out.println();
        }
    }
}
 */

//  PRINT CHARACTER PATTERN
public class patterns{
    public static void main(String[] args) {
        char ch='A';
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
        System.out.println();
        }
    }
}