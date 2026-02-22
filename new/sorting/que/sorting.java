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
    
    //BUBBLE SORT
    public static void bsort(int arr[],int size){
        
    }

    //SELECTION SORT
    public static void ssort(int arr[],int size){
        for(int i=0;i<size-1;i++){
            int minPos=i;
            for(int j=i+1;j<size;j++){         //j=i+1 & minPos=i
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            //swap
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }

    //Insertion Sort
    public static void isort(int arr[],int size){
        for(int i=0;i<size;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && prev>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }

    //Counting Sort
    public static void csort(int arr[],int size){
        int range=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            range=Math.max(range,arr[i]);
        }
        int count[]=new int[range+1];
        for(int i=0;i<size;i++){
            count[arr[i]]++;
        }

        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
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
                case 1:System.out.println("Bubble sort array:");
                bsort(arr,size);
                printarr(arr,size);
                System.out.println("Thank you to be here!");
                break;

                case 2:System.out.println("Selection sort array is:");
                ssort(arr,size);
                printarr(arr,size);
                System.out.println("Thank you to be here!");
                break;

                case 3:System.out.println("Insertion sort array is:");
                isort(arr,size);
                printarr(arr,size);
                System.out.println("Thank you to be here!");
                break;

                case 4 :System.out.println("Counting Sort array is:");
                csort(arr,size);
                printarr(arr,size);
                System.out.println("Thank you to be here!");
                break;

                default : System.out.println("Invalid Choice");
            }
            sc.close();
        }
    }
}
