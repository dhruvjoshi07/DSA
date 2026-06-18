package Problems;
/* PROBLEM 1:
Given a "2 x n" board and tiles of size"2 x 1",count the 
number of ways to tile the given board using 2x 1 tiles.
(A tile can either be placed horizontally or vertical.)
*/
import java.util.*;
public class tiling {
    public static int til(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //vertical
        int ver=til(n-1);

        //horizontal
        int hor=til(n-2);

        //totalways
        int totalways=ver+hor;
        return totalways;
    }
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("What should be length of floor(2 x n): ");
        int length=sc.nextInt();
        System.out.println("The number of ways tiles can fit on floor(horizontally or vertically): "+til(length));
        sc.close();
    }
}
