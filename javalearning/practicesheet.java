/* 
// Question=1
import java.util.*;
public class practicesheet{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number:");
            int number=sc.nextInt();
            String type=((number>=0)?"Positive":"negative");
            System.out.println(type);
            sc.close();
        }
        
    }
}
*/

/* 
// Question=2
import java.util.*;
public class practicesheet{
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Your measured temperature:");
            double temp=sc.nextDouble();
            String type=((temp>100)?"YOU HAVE FEVER":"YOU DON'T HAVE FEVER");
            System.out.println(type);
        }

    }
}
*/

// Question=3
/* 
import java.util.*;
public class practicesheet{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter week number");
            int week=sc.nextInt();
            switch(week){
                case 1:System.out.println("Monday");
                break;
                case 2:System.out.println("Tuesday");
                break;
                case 3:System.out.println("Wednesday");
                break;
                case 4:System.out.println("Thursday");
                break;
                case 5:System.out.println("Friday");
                break;
                case 6:System.out.println("Saturday");
                break;
                case 7:System.out.println("Sunday");
                break;
                default:System.out.println("Week has 7 days!");
            }
        }
    }
}
    */


// QUESTION=5
import java.util.*;
public class practicesheet{
    public static void main(String[] args) {
        System.out.println("Enter a year to check its an leap year or not:");
        try(Scanner sc =new Scanner(System.in)){
            int year=sc.nextInt();
            if(year%4==0){
                if(year%100==0){
                    if(year%400==0){
                        System.out.println("It's an leap year!");
                    }else {
                        System.out.println("Not a leap year!");
                    }
                }else{
                    System.out.println("Not a leap year!");
                }
            }else{
                System.out.println("Not a leap year!");
            }
        }
    }
}
