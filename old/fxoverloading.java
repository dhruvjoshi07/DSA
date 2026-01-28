
// Function Overloading with parameters
public class fxoverloading{
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args){
            System.out.println("The sum is:"+sum(3,4));
            System.out.println("The sum is:"+sum(7, 8, 4));
        }
    }
  

// // Fx overloading with datatypes
// public class fxoverloading{
//     public static int sum(int a,int b){
//         return a+b;
//     }
//     public static float sum(float a,float b){
//         return a+b;
//     }
//     public static void main(String[] args) {
//         System.out.println("The sum is :"+sum(2, 3));
//         System.out.println("The sum is:"+ sum(8.9f, 5.6f));
//     }
// }

