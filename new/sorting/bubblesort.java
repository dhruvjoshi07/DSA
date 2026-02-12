package sorting;
import java.util.*;
public class bubblesort {
    public static void sort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
    }
    /*Bubble sort=5,4,1,3,2
 5 ko her kisi se compare kra and we got
 4 1 3 2 5
 now 4 se compare
 1 3 2 4 5
 now 3 ko compare
 1 2 3 4 5
 we see now arr is sorted
logic:
for(i=0 to n-2)
    for(j=0 to n-2-i)
*/
    public static void main(String [] args){
        try(Scanner sc=new Scanner(System.in)){
            int arr[]=new int[50];
            int size=5;
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
            

        }
    }
}
