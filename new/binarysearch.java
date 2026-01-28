// condition=sorted arrays (descending or ascending)
// start,mid,end(three parametrs)
/* 
pseudo code-
 start=0,end=n-1
 while(start<=end)
    find mid
    compare mid & key
       mid==key (found)
       mid>key (left)(end=mid-1)
       mid<key(right)(start=mid+1)
*/
public class binarysearch {
    public static int search(int num[],int key){
        int start=0;
        int end=num.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(num[mid]== key){
                return mid;
            }
            if(num[mid]>key){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int num[]={2,4,6,8,10,12,14,16,18,20};
        int key=18;
        System.out.println("The index key is on:"+ search(num,key));
    }
}
