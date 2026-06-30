package Problems;
// conditions ese hai bs a-z aa skte na ki A,@ ,etc.isliye liye hammei hash usena padega
// index find=currchar-'a'
public class StrDuplicate {
    public static void removeduplicates(String str,StringBuilder newStr,int index,boolean arr[]){
        //base case
        if(index == str.length()){
            System.out.println(newStr);
            return;
        }
        //work
        char currChar=str.charAt(index);
        if(arr[currChar-'a']==true){
            removeduplicates(str,newStr,index+1,arr);
        }else{
            arr[currChar-'a']=true;
            removeduplicates(str,newStr.append(currChar),index+1,arr);
        }
    }
    public static void main(String[] args){
        String str="appnacollege";
        removeduplicates(str,new StringBuilder(""),0,new boolean[26]);
    }
}
