/* 

    public static void printhelloworld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
    public static void main(String[] args) { //void refers return type it means empty value
        // access modifier refers public static & main is the function
        printhelloworld();
        // main function mei call krne k liye function ka nam likhna hota
    }
}
*/
/* 
// Addition 
// ****CALL BY VALUE IS A COPY NOT ORIGINAL
// ***CALL BY VALUE WORKS OB JAVA AND C++ WORKS ON CALL BY REFERENCE(ORIGINAL)
// import java.util.Scanner;
public class functions{
    public static int calculatesum(int num1, int num2){
        int sum=num1+num2;
        return sum;
    }
    public static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }

    public static void main(String[] args) {
        int c=5;
        int d=10;
        swap(c,d);
        try(Scanner sc=new Scanner(System.in)){
            int a=sc.nextInt();
            int b=sc.nextInt();
            calculatesum(a,b);
            System.out.println("sum");
        }
    }
}
*/
/* 
// PRODUCT OF a&b
public class functions{
    public static int product(int a, int b){
      int mul=a*b;
      return mul;
    }
    public static void main(String[] args) {
        int a=3;
        int b=5;
        int mul=product(a,b);
        System.out.println("The product is:"+mul);
        mul=product(10,20);
        System.out.println("product is:"+mul);     
    }
}
*/

// // Factorial of a number,n(ex.=n!)
// public class functions{
//     public static int factorial(int n){
//         int f=1;
//         for(int i=1;i<=n;i++){
//             f=f*1;
//         }
//     return f;

//     }
//     public static void main(String[] args) {
//         System.out.println(factorial(4));
//     }
// }

// Binomial coefficient
public class functions{
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*1;
        }
        return f;
    }
    public static int binocoeff(int n,int r){
        int a= factorial(n);
        int b= factorial(r);
        int c= factorial(n-r);

        int d=(a/(b*c));
        return d;
    }

    public static void main(String[] args) {
        System.out.println(binocoeff(5, 2));
    }
}
