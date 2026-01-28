package old;
// Que:Check number is prime or not
/* 
// (APPROACH_01)
public class primeno{
    public static boolean isPrime(int n){
        // corner case for 2
        if(n==2){
            return true;
        }
        boolean isPrime=true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isPrime=false;
                return isPrime;
        }
    }
        return isPrime;
}

    public static void main(String args[]) {
        System.out.println("The number is :"+isPrime(5));
    }

}
 */

/*
// APPROACH_02(organised)
public class primeno{
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        boolean isPrime=true;
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                 isPrime=false;
            }
        }
        return isPrime;
    }
    
    public static void main(String[] args) {
        System.out.print("The number is:"+isPrime(2));
    }
}
*/


/* 
// Print all Primes in a Range
public class primeno{
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        boolean isPrime=true;
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return isPrime;
    }



    public static void PrimeinRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println("VALUES:"+i);
            }
        }
        System.out.println("");
    }



    public static void main(String[] args) {
        PrimeinRange(20);
    }
}
*/


