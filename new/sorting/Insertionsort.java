package sorting;
import java.util.*;
public class Insertionsort {

    //insertion sort function
    public static void isort(int arr[],int size){
        for(int i=0;i<size;i++){
            int curr=arr[i];
            int prev=i-1;

            //finding current postion
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }

            //insertion
            arr[prev+1]=curr;
        }
    }

    //function:printing the array
    public static void printarr(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){

            System.out.println("Enter the elements you wanted sorted:");
            //declare size of array so that array size can't fixed
            int arr[]=new int[50];
            int size=8;

            //declare array elemnts by user
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }

            System.out.print("The sorted array is: ");
            //calling the function
            isort(arr,size);
            printarr(arr,size);

            sc.close();
        }
    }
}
