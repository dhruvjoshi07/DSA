package sorting;
//it gives less complexity include inbuilt where cases is best cuz it give near to n 
import java.util.*;
//it done only jb countable ho like marks of students
// minimum se maximum tak ki range and only +ve numbers
public class countingsort {

    public static void countsort(int arr[],int size){
        //finding range
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


    //printing the array
    public static void printarr(int arr[],int size){
        for(int i=0;i<size;i++){  
        System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the array length: ");
            int size=sc.nextInt();
            int arr[]=new int[50];

            System.out.println("Enter the elements of array:");
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
            countsort(arr,size);
            System.out.print("The sorted array is:");
            printarr(arr,size);

            sc.close();
        }
    }
}
