package array;
// MAX SUBARRAY SUM=sbko subarray ko add krenge
import java.util.*;

public class BruteForce {
    public static void maxsum(int arr[],int size){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                int curr=0;
                for(int k=i;k<=j;k++){
                    //subarray sum
                    curr+=arr[k];
                }
                System.out.print(curr+" ");
                if(max<curr){
                    max=curr;
                }
            }
        }
        System.out.println("max sum="+max);
    }
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            int arr[]=new int[50];
            int size=8;
            System.out.println("Enter the elements for finding sub array:");
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
            maxsum(arr,size);

            sc.close();
        }
    }
}
//3nested loop ho or woh n tak jaye toh 
//woh tc=0(n^3)