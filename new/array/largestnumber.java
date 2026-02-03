package array;
// -infinity=in java it write Integer.MIN_VALUE
// +infinty=in java it writes Integer.MAX_VALUE
import java.util.*;
public class largestnumber {
    public static int greatest(int num[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if(largest<num[i]){
            largest=num[i];
            }
        }
        return largest;
    }
    public static void main (String[]args){
        try(Scanner sc=new Scanner(System.in)){
            int num[]=new int[6];
            System.out.print("Enter the first element:");
            num[0]=sc.nextInt();
            System.out.print("Enter the second element:");
            num[1]=sc.nextInt();
            System.out.print("Enter the third element:");
            num[2]=sc.nextInt();
            System.out.print("Enter the fourth element:");
            num[3]=sc.nextInt();
            System.out.print("Enter the fifth element:");
            num[4]=sc.nextInt();
            System.out.print("Enter the sixth element:");
            num[5]=sc.nextInt();
            int max = greatest(num);
            System.out.println("Largest number is: " + max);
        }
    }
}
