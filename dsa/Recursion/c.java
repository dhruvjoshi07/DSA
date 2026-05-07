package Recursion;

public class c {

    // Problem :x^n  (x^n=x * x^n-1)
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x* power(x,n-1);
    }

    //Problem:Optimized Print x^n in 0(log n)
    public static void main(String[] args){
        System.out.println(power(2,10));
    }
}
