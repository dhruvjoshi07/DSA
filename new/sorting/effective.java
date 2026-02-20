package sorting;
import java.util.*;
public class effective {
    public static void printarr(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String [] args){
        try(Scanner sc=new Scanner(System.in)){
            int arr[]=new int[50];
            int size=5;

            System.out.println("Enter the elements for sorting:");
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
            System.out.print("The sorted array is: ");
            Arrays.sort(arr,0,size);
            printarr(arr,size);

            sc.close();
        }
    }
}
