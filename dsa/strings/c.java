package strings;
/* 
//IMP:Check if a string is a Palindrome like, "racecar","noon","madam"
import java.util.*;
public class c {

    public static boolean ispalindrome(String word){
        for(int i=0;i<word.length()/2;i++){
            int n=word.length();
            if(word.charAt(i)!=word.charAt(n-1-i)){
                //not a palindrome
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        try(Scanner sc= new Scanner(System.in)){
            System.out.println("Check if a string is a Palindrome...");
            String word;
            word=sc.nextLine();
            System.out.println(word+" is palindrome? "+ispalindrome(word));
            sc.close();
        }
    }
}//Time compllexity=0(n)
*/

//QUESTION:Given a route containing 4 directions(E,W,N,S),find the shortest path to reach desination "WNEENESENNN"
public class c {

    //direction function and shortest path
    public static float path(String route){
        int x=0,y=0;
        for(int i=0;i<route.length();i++){
            char dir=route.charAt(i);
            //North
            if(dir=='N'){
                y++;
            }
            //South
            if(dir=='S'){
                y--;
            }
            //East
            if(dir=='E'){
                x++;
            }
            //west
            if(dir=='W'){
                x--;
            }
        }
            //Dispacment formula(3,4)=5
            int x2=x*x;
            int y2=y*y;
            return (float)Math.sqrt(x2+y2);
    }
    public static void main(String args[]){
        String route;
        route="WNEENESENNN";
        //logic: N=y+1,S=y-1,W=x-1,E=x+1
        System.out.print("The shortest path to reach destination is: "+path(route));
    }
}  //Time complexity=0(n)