package sorting.que;
/* 
Question : Use the following sorting algorithms to sort an array:
a. Bubble Sort
b. Selection Sort
c. Insertion Sort
d. Counting Sort
You can use this array as an example : [3, 6, 2, 1, 8, 7, 4, 5, 3, 1 ]
*/
import java.util.*;
// import java.util.Arrays                     #imported
public class sorting {
    
    //BUBBLE SORT
    public static void bsort(int arr[],int size){
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-1-i;j++){      //size-1-i
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    //SELECTION SORT
    public static void ssort(int arr[],int size){
        for(int i=0;i<size-1;i++){
            int minPos=i;
            for(int j=i+1;j<size;j++){         //j=i+1 & minPos=i
                if(arr[minPos]<arr[j]){
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
            while(prev>=0 && arr[prev]<curr){
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
            while(count[i]<0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    //printing an array
    public static void printarr(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }

    //Inbuilt sorting
    public static void inbuilt(Integer arr[],int size){
        Arrays.sort(arr,0,size,Collections.reverseOrder());
    }

    //printing an Inbuilt array
    public static void printArr(Integer arr[],int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }


    //Main function
    //Main function
public static void main(String[] args){
    try(Scanner sc=new Scanner(System.in)){

        int arr[]=new int[50];
        Integer Arr[]=new Integer[50];

        System.out.print("Enter the array size: ");
        int size=sc.nextInt();

        System.out.println("Choose method:");
        System.out.println("1). Standard Sorting (Bubble/Selection/Insertion/Counting)");
        System.out.println("2). Inbuilt Sorting (Descending)");
        int choice=sc.nextInt();

        if(choice == 1){

            System.out.println("Enter the elements:");
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }

            System.out.println("Choose Sorting Algorithm:");
            System.out.println("1). Bubble Sort");
            System.out.println("2). Selection Sort");
            System.out.println("3). Insertion Sort");
            System.out.println("4). Counting Sort");

            int num=sc.nextInt();

            switch(num){
                case 1:
                    System.out.println("Bubble Sort:");
                    bsort(arr,size);
                    printarr(arr,size);
                    break;

                case 2:
                    System.out.println("Selection Sort:");
                    ssort(arr,size);
                    printarr(arr,size);
                    break;

                case 3:
                    System.out.println("Insertion Sort:");
                    isort(arr,size);
                    printarr(arr,size);
                    break;

                case 4:
                    System.out.println("Counting Sort:");
                    csort(arr,size);
                    printarr(arr,size);
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        }
        else if(choice == 2){

            System.out.println("Enter the elements:");
            for(int i=0;i<size;i++){
                Arr[i]=sc.nextInt();
            }

            System.out.println("Inbuilt Sorting (Descending):");
            inbuilt(Arr,size);
            printArr(Arr,size);
        }
        else{
            System.out.println("Invalid Main Choice!");
        }
        System.out.println("Thank you! Being here... ");
        }
    }
}
