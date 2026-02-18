package sorting;
import java.util.*;
public class Selectionsort {

    //Main function of the selection sort
    public static void sort(int arr[],int size){
        for(int i=0;i<size-1;i++){
            int minPos=i;
            for(int j=i+1;j<size;j++){
                if(arr[minPos]>arr[j]){
                    //condition ulta kr dega bs > and < toh smallest and largest element pick krega
                    minPos=j;
                }
            }
            //swap
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }

    //function of selection sort to print the array
    public static void printarr(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //main function of the code
    public static void main(String args[]){
        try(Scanner sc= new Scanner(System.in)){
            int arr[]=new int[50];
            int size=8;

            System.out.println("Enter the elements of an array for sorting:");
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }

            System.out.println("The sorted array is:");
            sort(arr,size);
            printarr(arr,size);

            sc.close();
        }
    }
}
