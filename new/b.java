import java.util.*;
public class b {
    public static void main (String[]args){
        /*
        // ways to write array
        int marks[]= new int[50]; //static array
        int numbers[]={1,2,3};
        String fruits[]={"apple","bannana"};
        */
        String fruits[]= new String[5];
        try(Scanner sc= new Scanner(System.in)){
            System.out.println("Enter the fruits:");
            fruits[0]= sc.nextLine();
            fruits[1]= sc.nextLine();  
            fruits[2]= sc.nextLine();
            fruits[3]= sc.nextLine();
            fruits[4]= sc.nextLine();  
            System.out.println("The first fruit u want to pick:"+fruits[0]);
            System.out.println("The second fruit u want to pick:"+fruits[1]);
            System.out.println("The third fruit u want to pick:"+fruits[2]);
            System.out.println("The fourth fruit u want to pick:"+fruits[3]);       
            System.out.println("The fifth fruit u want to pick:"+fruits[4]);
            System.out.println("The length of the array:"+fruits.length);
            sc.close();
        }
    }
}
