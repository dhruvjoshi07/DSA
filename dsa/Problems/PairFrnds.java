package Problems;
/*FRIENDS PAIRING PROBLEM
Given n friends ,each one can remain single or can be paired up with some other friend.
Each friend can be paired only once.Find out the total number of ways in which friends 
can remain single or can be paired up.
*/
public class PairFrnds {
    public static int frndpairing(int n){
        //base case
        if(n==1 || n==2){
            return n;
        }
        //pairs+choices+totalways
        return frndpairing(n-1)+(n-1)*frndpairing(n-2);
    }
    public static void main(String[]args){
   /*
   logic:
   n-1=pair choices
   n-2=1 pair ways
   total ways=n-1+n-1*n-2
    */  
    frndpairing(6);
    }
}
