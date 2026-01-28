
/*
//SYNTAX: datatype arrayNmae[]=new dataType[size];

import java.util.*;

public class arr1 {
    public static void main(String[] args) {
    // CReation of array
    int marks[]=new int[100];
    // int numbers[]={1,2,3};
    // int moreNumbers[]={4,5,6};
    // String fruits[]={"apple","mango"};
    // INPUT/OUTPUT
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

        // length of array
        System.out.println(marks.length);
    }
    }
}

*/

/* 
// PASSING ARRAYS AS ARGUMENT
public class arr1{
    public static void update(int marks[],int nonchangeable){
        nonchangeable=10;
                for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={23,45,43};
        int nonchangeable=5;
        update(marks, nonchangeable);
        System.out.println(nonchangeable);
        for (int i=0;i < marks.length; i++) {
            System.out.print(marks[i]+" ");
           
        }
        System.out.println("");
    }
}
*/

import java.util.*;

public class arr1{
    public static void update(int num[]){
        for(int i=0;i<num.length;i++){
            num[i]=num[i]+1;
        }
    }
    public static void main(String[] args) {
        int num[]=new int[50];
        try(Scanner sc= new Scanner(System.in)){
            System.out.print("Enter the first value:");
            num[0]=sc.nextInt();
            System.out.print("Enter the second value:");
            num[1]=sc.nextInt();
            System.out.print("Enter the third value:");
            num[2]=sc.nextInt();
            System.out.print("Enter the fourth value:");
            num[3]=sc.nextInt();
            System.out.print("Enter the fifth value:");
            num[4]=sc.nextInt();
            update(num);
                System.out.print("num= {"+num[0]+","+num[1]+","+num[2]+","+num[3]+","+num[4]+"}");
        }
    }
}