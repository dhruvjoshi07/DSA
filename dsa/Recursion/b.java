package Recursion;
//Problem 7:WAF to find first occurance of an element in array
public class b {
    public static int firstocc(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }

        return firstocc(arr,i+1,key);
    }

//Problem 8:WAF to find last occurance of an element in array
    public static int lastocc(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        
    }
    public static void main(String args[]){
        int arr[]={4,6,1,8,2,8};
        System.out.print(firstocc(arr,0,2));

    }
}
