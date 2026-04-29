package strings;
//comparison and substring
import java.util.*;
public class d {
    public static boolean stringComparison(String str1,String str2){
        //yaha ham == nhi lgate string mei
        while(str1.equals(str2)){
            return true;
        }
        return false;
    }

    //substring
    public static String substring(String str,int start,int end){
        String substr="";
        for(int i=start;i<end;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        try(Scanner sc= new Scanner(System.in)){

            //printing string user taken
            System.out.print("Enter the string: ");
            String str;
            str=sc.nextLine();
            System.out.println(str);

            //calling fx 
            int reqend=4;
            if(str.length()<reqend){
                System.out.println("Error:String is less than end");
            }else{
                System.out.println("Result"+substring(str,0,reqend));
            }

            //shortcut to find substring i.e.,inbuild fx
            System.out.print(str.substring(2,reqend));
            sc.close();
        }
    }
}
