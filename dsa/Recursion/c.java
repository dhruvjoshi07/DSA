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
    /*
    if n=even,x^n(2^10)=x^n/2 * x^n/2
    if n=odd,x^n(2^5)=x*x^n/2 * x^n/2
    */
    public static void main(String[] args){
        System.out.println(power(2,10));
    }
}
