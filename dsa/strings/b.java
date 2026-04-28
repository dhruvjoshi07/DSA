package strings;
import java.util.*;
//ek ek chr ko dhundna k liye
public class b {
    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        try(Scanner sc= new Scanner(System.in)){
            System.out.println("Enter the name: ");
            String name;
            name=sc.nextLine();
            System.out.println(name);
            printLetters(name);
            sc.close();
        }
    }
}
