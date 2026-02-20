package sorting;
import java.util.*;
public class effective {

    public static void revarr(Integer arr[],int size){
        /*yea isliye bnaya kyuki collection jo hai object pr kaam krta
        and kyuki int ek primitive data type hai toh array error dega
        so ham 'Integer' use krenge taki Collection object pr kaam kre
        */
        Arrays.sort(arr,0,size,Collections.reverseOrder());
        //comperator =reverseOrder()
    }   


    public static void printarr(Integer arr[],int size){
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+" ");
        }
    }

    public static void main(String [] args){
        try(Scanner sc=new Scanner(System.in)){
            Integer arr[]=new Integer[50];
            int size=5;

            System.out.println("Enter the elements for sorting:");
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }

            //Ascending sort
            Arrays.sort(arr,0,size); //line of code
            System.out.println("Ascending sorted array is: ");
            printarr(arr,size);

            //Descending sort
            // Integer mrevarr[]=new Integer[50];
            revarr(arr,size);
            System.out.println("Descending sorted array is:");
            printarr(arr,size);

            sc.close();
        }
    }
}
