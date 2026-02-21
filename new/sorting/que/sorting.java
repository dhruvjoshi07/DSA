package sorting.que;
/* 
Question : Use the following sorting algorithms to sort an array in 
DESCENDING order :
a. Bubble Sort
b. Selection Sort
c. Insertion Sort
d. Counting Sort
You can use this array as an example : [3, 6, 2, 1, 8, 7, 4, 5, 3, 1 ]
*/
import java.util.*;
public class sorting {
    public static void bsort(int arr[],int size){
        
    }
    public static void ssort(int arr[],int size){

    }
    public static void isort(int arr[],int size){

    }
    public static void csort(int arr[],int size){

    }
    public static void printarr(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            int arr[]=new int[50];

            System.out.print("Enter the array size: ");
            int size=sc.nextInt();

            System.out.println("Enter the elements of array:");
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }

            System.out.println("Enter the type of sort u wanna do:");
            System.out.println("1).-Bubble sort:");
            System.out.println("2).-Selection sort" );
            System.out.println("3).-Insertion sort");
            System.out.println("4).-Counting sort");
            System.out.print( "Choose one number: ");
            int num=sc.nextInt();

            switch(num){
                case'1':System.out.println("Bubble sort array:");
                bsort(arr,size);
                printarr(arr,size);
                System.out.print("Thank you to be here!");
                break;

                case'2':System.out.println("Selection sort array is:");
                ssort(arr,size);
                printarr(arr,size);
                System.out.print("Thank you to be here!");
                break;

                case'3':System.out.println("Insertion sort array is:");
                isort(arr,size);
                printarr(arr,size);
                System.out.print("Thank you to be here!");
                break;

                case'4':System.out.println("Counting Sort array is:");
                csort(arr,size);
                printarr(arr,size);
                System.out.print("Thank you to be here!");
                break;

            }
            sc.close();
        }
    }
}
