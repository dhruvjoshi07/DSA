package Recursion;
//it is the method of solving a computational problem where the soln depends on soln to small instance of the same problem
//chote kaam pehle kar lo ,jo hamme pta hota usko ham BASE CLASS nad jisko call krte usko RECURSIVE FUNCTIONS
//Two Direction=top to down and down to top
public class a {
    //Problem1:Print numbers from n to 1 (Decreasing order)
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

    //problem 4:print sum of first n natural numbers
    public static int natNum(int n){
        if(n==1){
            return 1;
        }
        int sum=n+natNum(n-1);
        return sum;
    }

    //problem 5:print nth fibonacci number
    public static int fib(int x){
        if(x==0 || x==1){
            return x;
        }
        return fib(x-1)+fib(x-2);
    }

    //problem 6:check if a given array is sorted or not
    public static boolean arrSort(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return arrSort(arr,i+1);
    }

    //logic:base case define,kaam kya krna hai pta ho ,inner fx ko call lagana
    public static void main(String args[]){
         int n=5;
         int m=5;
         int x=10;
         printDec(n);

         System.out.println();
         printInc(n);

         System.out.println();
         System.out.println(fact(m));

         System.out.println(natNum(n));
         System.out.println(fib(x));
         
         System.out.println();
         int arr[]={1,2,3,4,5};
         System.out.println(arrSort(arr,0));
         //call Stack while recursion 
         //Stack overflow when base is not there

    }
}
