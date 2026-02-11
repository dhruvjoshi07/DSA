/*  
// QUESTION=1
public class prtc {
    public static void main(String[] args) {
        
    for(int i= 0;i<5;i++){
        System.out.println("Hello");
        i+=2;
        }   
    }
}

// QUESTION=2
import java.util.*;
public class prtc{
    public static void main(String[] args) {
       try(Scanner sc=new Scanner(System.in)){
        int number;
        int choice;
        int evenSum=0;
        int oddSum=0;
       

       do { 
           System.out.println("Enter the number:");
           number=sc.nextInt();
           if (number % 2==0){
            evenSum+=number;
           }else{
            oddSum+=number;
           }
           System.out.println("do u want to continue?press 1 for yes or 0 for no");
           choice=sc.nextInt();
       } while (choice==1);
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}
}*/
// // QUESTION=1
import java.util.*;
public class prtc1{
    public static void main(String[] args){
        try(Scanner sc= new Scanner(System.in)){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            float d=(a+b+c)/3;
            System.out.println("Average of 3 number is:");
            System.out.print(d);
            sc.close();
        }
    }
}


// // QUESTION 2
// import java.util.*;
// public class practice{
//     public static void main(String[] args){
//         try(Scanner sc= new Scanner(System.in)){
//             int a=sc.nextInt();
//             int b=a*a;
//             System.out.println("Area of Square:");
//             System.out.print(b);
//             sc.close();
//         }
//     }
// }


// // QUESTION 3
// import java.util.*;
// public class practice{
//     public static void main(String[] args){
//         try(Scanner sc= new Scanner(System.in)){
//             Float pencil=sc.nextFloat();
//             Float pen=sc.nextFloat();
//             Float eraser=sc.nextFloat();
//             Float sum=pencil+pen+eraser;

//             System.out.println("Total Cost:");
//             System.out.println(18/100+sum);

//             sc.close();
//         }
//     }
// }

// // QUESTION 4
// public class practice{
//     public static void main(String[] args){
//         byte b=4;
//         char c='a';
//         short s= 512;
//         int i =1000;
//         float f=3.14f;
//         double d=99.9954;

//         System.out.println((f*b)+(i%c)-(d*s));
//     }
// }
