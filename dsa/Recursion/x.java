package Recursion;
import java.util.*;
//memo(memorization) yea technique use hota ki val store kr ske
public class x {
    //decreasing number
    public static int num(int n){
        if(n==1){
            return n;
        }
        System.out.print(n+" ");
        return num(n-1);
    }
    //recurssion factorial
    public static int fact(int n){
        //base class
        if(n<0) throw new IllegalArgumentException("Number must be non-negative.");
        if(n==0 || n==1){
            return 1;
        }
        //work class
        return n*fact(n-1);
    }
    //fabonacci recursion
    public static long fib(int n,long[] memo){
        //base class
        if(n==0||n==1){
            return n;
        }
        //most interesting line to store and reuce code time compile
        if (memo[n]!=0) return memo[n];
        //work class
        return fib(n-1,memo)+fib(n-2,memo);
    }
    //main class
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter choice (1 for Math Operations, 0 for Countdown): ");
        int choice = sc.nextInt();

        // Rule Switch (Notice karo break; gayab ho gaye hain)
        switch (choice) {
            case 1 -> {
                System.out.print("Enter a number: ");
                int num = sc.nextInt();
                System.out.println("Factorial of " + num + " is: " + fact(num));
                
                long[] memo = new long[num + 1];
                System.out.println("Fibonacci number at position " + num + " is: " + fib(num, memo));
            }
            case 0 -> {
                System.out.print("Enter starting number: ");
                int n = sc.nextInt();
                System.out.print("Countdown: ");
                num(n);
                System.out.println();
            }
            default -> System.out.println("Unknown choice selected.");
        }

        } catch (InputMismatchException e) {
        System.out.println("Error: Please enter valid integers only.");
        } catch (Exception e) {
        System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
        System.out.println("Execution completed successfully!");
        }
    }
}