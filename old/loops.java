
/*public class loops {
    public static void main(String[] args) {
        int counter=0;
        while(counter<100){
            System.out.println("Hello dhruv");
            counter++;
        }
        System.err.println("FINISHED 100 TIMES");
    }
}*/

/*
 public class loops{
    public static void main(String[] args) {
        int i=1;
        while(i>0 && i<=10){
            System.out.println(i);
            i++;
        }
    }
}
 */

 /*
import java.util.*;
public class loops{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Let you decide to end this loop:");
            int end=sc.nextInt();
            int i = 1;
            while(i<=end){
                System.out.println(i);
                i++;
            }
            System.out.println();
        }
    }
}
*/
/*
import java.util.*;
public class loops{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Print sum of first n natural numbers");
            int n=sc.nextInt();
            int sum=0;
            int i = 1;
            while(i<=n){
                sum=sum+i;
                i++;
            }
            System.out.println(sum);
        }
    }
}
 */

 /* 
//  <------------------------FOR LOOP---------------->
public class loops{
    public static void main(String[] args) {
        for(int i = 0;i<=10;i++){
            System.out.println("Hello World");
        }
    }
}
 */

 /* 

// Que:Print SQUARE pattern
public class loops{
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            System.out.println("****");
        }
    }
}
*/


// // Print Reverse of a number
// // (kisi number ko 10 se divide krde last digit miita)
// // LOGIC= 1).Last digit num%10
//         // 2).remove last digit
// // every nuber less than 10 it gives 0
// public class loops{
//     public static void main(String[] args) {
//         int n=100;
//         while(n>0){
//             int lastdigit =n%10;
//             System.out.println(lastdigit);
//             n=n/10;
//         }
//         System.out.println();
//     }
// }



// // REVERRSE THE GIVEN NUMBER
//         // rev=(rev*10)+lastdigit(****imp**)
// public class loops{
//     public static void main(String[] args) {
//         int n =10899;
//         int rev=0;
//         while(n>0){
//             int lastdigit=n%10;
//             rev=(rev*10)+lastdigit;
//             n=n/10;
//         }
//         System.out.println(rev);   }
// } 

// check if number is a prime or not
    // (LOGIC:n=n^1/2*n^1/2)
        // if n= a*b
        // if n=i*b
import java.util.*;
public class loops{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n=sc.nextInt();
            int i;
            if(n==2){
                System.out.println(n+" is a prime number");
            }else{
                boolean isPrime =true;
                for(i=2;i<=n-1;i++){
                    if(n%i==0){
                        isPrime = false; 
                    }
                }
                if(isPrime==true){
                    System.out.println(n+" is aprime number");
                }
            }

        }
    }
}


/*import java.util.*;
public class learning2{
    public static void main(String[] args) {
        try(Scanner sc =new Scanner(System.in)){
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println(sum);
        sc.close();
        }
    }
}*/
/*import java.util.*;
public class learning2{
    public static void main(string[] args){
        try(Scanner sc=new Scanner(System.in)){
            float r1=sc.nextFloat();
            float radius =3.14f*r1*r1;
            System.out.println("AREA OF CIRCLE:");
            System.out.println(radius);
            sc.close();
        }
    }
}*/
/* 
public class learning2{
    public static void main(String[] args) {
        char a='a';
        char b='b';
        System.out.println((int)(b));
        System.out.println((int)(a));
        System.out.println(b-a);//it gives 98-97=1
        // b-a 'char,byte,short' changes to 'int' tbhi ho skte jb expression ho
    }
}
    */