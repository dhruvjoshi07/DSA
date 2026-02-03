//continuous part of array is Subarray
package array;
//n size array k andar n(n+1)/2 subarrays hote
import java.util.*;
public class subarrays {

    // making function for the subarray
    public static void subarray(int arr[],int size){
        int tp=0;
        size = 5;
        for(int i=0;i<size;i++){
            int start=i;
            for(int j=i;j<size;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                    tp++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("Total subarrays in the array:"+tp);
    }
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){

            // declare the array and size
            int arr[]=new int[50];
            int size=5;

            // taking elements from user
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }

            // we call the subarray function
            subarray(arr,size);
            sc.close();
        }
    }
}
