package strings;
import java.util.*;
// String builder   #sb.toString()(yea kisi bhi obj ko string bna deta)
public class f {
    public static void main(String args[]){
        /* 
        StringBuilder sb =new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        System.out.println(sb.length());
    }
        */

    // Question:For a given String convert each the first letter of each word to uppercase,ex."hi,i am dhruv"
    try(Scanner sc=new Scanner(System.in)){
        
        System.out.println("Enter the sentance:");
        String name;
        name=sc.nextLine();

        System.out.println(touppercase(name)+"!");
        sc.close();
        }
    }
    public static String touppercase(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}