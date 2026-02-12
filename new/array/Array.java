package array;

//SYNTAX: datatype arrayNmae[]=new dataType[size];

import java.util.*;

public class Array {
    public static void main(String[] args) {
      
    /*
    // CReation of array
    int marks[]=new int[50];
    int numbers[]={1,2,3};
    int moreNumbers[]={4,5,6};
    String fruits[]={"apple","mango"};
    */

    
    // INPUT/OUTPUT
    int marks[]=new int[100];
    try(Scanner sc=new Scanner(System.in)){
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("phy:" + marks[0]);
        System.out.println("chem:" + marks[1]);
        System.out.println("math:" + marks[2]);

        // update
        marks[2]=marks[2]+10;
        System.out.println("math:"+marks[2]);
    }
    }
}
