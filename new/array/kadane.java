package array;
import java.util.*;
//chota + kisi bde mius - se add kre toh - hee ata hai so kadane did mius to 0
//mtlb - minus lene se acha 0 hee le le
public class kadane{
    public static void kadaneSum(int arr[],int size){
        int curr=0;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<size;i++){
            curr=curr+arr[i];
            if(curr<0){
                curr=0;
            }
            max=Math.max(max,curr);
        }
    System.out.println("Max subarray sum is:"+max);
    }
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            int size=8;
            int arr[]=new int[50];

            System.out.println("Enter the elements:");
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }

            kadaneSum(arr,size);
        }
    }
}

