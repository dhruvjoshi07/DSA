import java.util.*;
public class condition{
    public static void main(String[] args) {
        // char ch='a';
        // switch(ch){
        //     case 'd':System.out.println("Samosa");
        //         break;
        //     case 'a':System.out.println("Burger");
        //         break;
        //     case 'f':System.out.println("Pizza");
        //         break;
        //     default :System.out.println("Its a prank");
        // }
      
        // int number = 4;
        // String type=((number%2)==0)?"even":"odd";
        // System.out.println(type);

        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter first value:");
            float a=sc.nextFloat();
            System.out.println("Enter second value:");
            float b=sc.nextFloat();
            System.out.println("Enter operator:");
            char operator=sc.next().charAt(0);
            switch(operator){
                case '+':System.out.println(a+b);
                    break;
                case'-':System.out.println(a-b);
                    break;
                case'*':System.out.println(a*b);
                    break;
                case'/':System.out.println(a/b);
                    break;
                case'%':System.out.println(a%b);
                    break;
                default:System.out.println("we will update our cal soon.Thank u!");
            }
            sc.close();
        }

        //     System.out.println("Enter your name");
        //     String name=sc.nextLine();
        //     System.out.println(name);
        //     System.out.println("Enter your marks:");
        //     Float marks=sc.nextFloat();
        //     String type=((marks>=33))?"Pass":"Fail";
        //     System.out.println(type);


        // Float income=sc.nextFloat();
        // if(income<500000){
        //     System.out.println("YOU HAVE TO PAID 0% PASS");
        // }else if (income>=500000 && income<1000000){
        //     System.out.println("YOU HAVE TO PAY :"+0.2*income);
        // }else{
        //     System.out.println("YOU HAVE TO PAY:"+0.3*income);
        // // }
    //     sc.close();
    // }
}
}
