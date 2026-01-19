import java.util.*;
public class reset {
    
    public static int power(int a,int b){
        return (int)Math.pow(a,b);
    }

    public static void ispositive(int num){
        String type=num>=0?"Positive":"Negative";
        System.out.print(type);

    }

    public static void temp(double num){
        System.out.print("Enter your measured temperature: ");
        String type=num>100?"YOU HAVE FEVER":"YOU DON'T HAVE FEVER";
        System.out.print(type);
    }

    public static void leapyear(int year){
        String type=(year%4==0 && year%100!=0) || (year%400==0)?"LEAP YEAR":"NOT A LEAP YEAR";
        System.out.print(type);
    }

    public static int factorail(int n){
        int f=1;
        for(int i =1;i<=n;i++){
            f=f*i;
        }
        return f;
    }

    public static int binocoef(int n,int r){
        // formula is n!/r(n-r)!
        int a=factorail(n);
        int b=factorail(r);
        int c=factorail(n-r);
        int d=a/b*c;
        return(d);
    }

    public static boolean primeno(int n){
        if(n<=1) return false;
        if(n==2) return true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){
        System.out.print("Enter base: ");
        int a=sc.nextInt();
        System.out.print("Enter exponent: ");
        int b=sc.nextInt();
        System.out.println(power(a,b));
        System.out.print("Enter a number: ");
        int c=sc.nextInt();
        ispositive(c);
        System.out.println();
        System.out.println("Enter your measured temperature: ");
        double d=sc.nextDouble();
        temp(d);
        System.out.println();
        System.out.print("Enter a year: ");
        int e=sc.nextInt();
        leapyear(e);
        System.out.println();
        System.out.print("Enter the number you want factorial of:");
        int f=sc.nextInt();
        System.out.println("The factorial is:"+factorail(f));
        System.out.println("Huff!i m tired please stop for a moment");
        boolean reply=sc.nextBoolean();
        if(reply==true){
            System.out.println("Ys i will wait!");
        }else{
            System.out.println("No we will continue!");
            System.out.print("Enter n value for binomial coefficient: ");
            int g=sc.nextInt();
            System.out.print("Enter r value for binomial coefficient: ");
            int h=sc.nextInt();
            System.out.println("The binomial coefficient is: "+binocoef(g,h));
        }
        System.out.println("Enter the number to check prime or not:");
        int p=sc.nextInt();
        System.out.println(primeno(p)+"is your answer.");
        }
    }
}



