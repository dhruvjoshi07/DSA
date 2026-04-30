package Recursion;
//it is the method of solving a computational problem where the soln depends on soln to small instance of the same problem
//chote kaam pehle kar lo ,jo hamme pta hota usko ham BASE CLASS nad jisko call krte usko RECURSIVE FUNCTIONS
//Two Direction=top to down and down to top
public class a {
    //problem 1 :print the reverse number
    public static void printDec(int n){
        if(n==1){
        System.out.print(n);
        return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    //poblem 2:print the series upto 10
    public static void printInc(int n){
        if(n==1){
        System.out.print(n);
        return;
        }
            printInc(n-1);
            System.out.print(n+" ");
    }
    //problem 3:print factorial of number n
    public static int fact(int m){
        if(m==0){
            return 1;
        }
        int x=m*fact(m-1);
        return x;
    }
    //Problem1:Print numbers from n to 1 (Decreasing order)
    //logic:base case define,kaam kya krna hai pta ho ,inner fx ko call lagana
    public static void main(String args[]){
         int n=10;
         int m=5;
         printDec(n);
         System.out.println();
         printInc(n);
         System.out.println();
         System.out.println(fact(m));
         //call Stack while recursion 
         //Stack overflow when base is not there

    }
}
