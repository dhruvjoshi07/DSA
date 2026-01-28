
/*
// QUESTION01(Write a java method to compute the average of 3 numbers)
public class fxque {
    public static int avg(int a,int b,int c){
        int n=(a+b+c)/3;
        return n;
    }
    public static void main(String[] args) {
        System.out.println("The average is :"+avg(8, 3, 7));
    }
}
*/

/*
// QUE02:Write a method named is aEven that accepts an int argumrnt.The method should return true if the argument is even or false otherwise .also write a program to test your method
public class fxque{
    public static boolean isEven(int n){
        if(n==2){
            return true;
        }
        int num=n % 2;
        if(num==0){
            return true;
        }
        else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        System.out.print(isEven(7));
    }
}
*/


// QUE3:Write a java program to check is a number is palindrome in java
import java.util.*;
public class fxque{
    public static boolean isPalindrome(int n){
        int palindrome=n;
        int rev=0;
        while(palindrome!=0){
            int rem=palindrome%10;
            rev=rev*10+rem;
            palindrome=palindrome/10;
        }
        if(n==rev)
        return true;{
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.print("Please Enter the number:");
        try(Scanner sc= new Scanner(System.in)){
            int palindrome=sc.nextInt();
            if(isPalindrome(palindrome)){
                System.out.println("Number: "+palindrome+"is a Palindrome");

            }
            else{
                System.out.print("Number: "+palindrome+"is not a palindrome");
            }
        }
    }
}


/* 
// QUE05:write a java method to compute the sum of the digits is an integer
import java.util.*;
public class fxque{
    public static int sumDigits(int n){
        int sumofDigit=0;
        while(n>0){
            int lastDigit=n%10;
            sumofDigit+=lastDigit;
            n/=10;
        }
        return sumofDigit;
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        System.out.print("Input an integer:");
        int digits=sc.nextInt();
        System.out.println("The sum is "+sumDigits(digits));
        }
    }
}
*/

