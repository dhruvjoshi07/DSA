//This is a question of reverse Aarray and make the pairs of reveerse array
package array;
import java.util.*;
public class revarray {

    // reverse the array
    public static void rev(int n[],int size){
        int first=0; //declare first elements
        int last=size-1;  //declare last elements
        while(last>first){
            int temp=n[last];
            n[last]=n[first];
            n[first]=temp;
            // swap

            first++;
            last--;
        }
        System.out.println();
    }

    // we will find the pairs of reverse array
    public static void pair(int n[],int size){
        size=8;
        int tp=0; //Total Pairs
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                System.out.print("{"+n[i]+","+n[j]+"}");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs:"+tp);
    }


    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
            int num[]=new int[50];//declare the size of array
            int size=8;//alwys declare size when using array method
            
            System.out.println("Enter the elements you want to put in the array:");
            /* 
            // loop to print this all in one statement(
            num[0]=sc.nextInt();num[1]=sc.nextInt(); //elements taken by user
            num[2]=sc.nextInt();num[3]=sc.nextInt();
            num[4]=sc.nextInt();num[5]=sc.nextInt();
            num[6]=sc.nextInt();num[7]=sc.nextInt();)
            */
            for(int i=0;i<size;i++){
                num[i]=sc.nextInt();
            }

            // print the array form
            System.out.print("Orinal array: { ");
            for(int i=0;i<size;i++){
                System.out.print(num[i]+" ");
            }
            System.out.print("}");

            // calling the fx
            rev(num,size);

            // print reverse array
            System.out.print("Reversed Array is:{ ");
            for(int i=0;i<size;i++){
                System.out.print(num[i]+" ");
            }
            System.out.print("}");

            System.out.println();
            // finding reverse pairs
            System.out.println("Original pairs:");
            pair(num,size);
        }
    }

