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
/* 
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
*/
public class binarysearch {

    static int search(int arr[], int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == x) {
                return mid;
            } 
            else if (arr[mid] < x) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9, 11};
        int x = 7;

        int index = search(arr, x);

        if (index == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " + index);
    }
}

//templete
int left = 0, right = nums.length - 1;
while (left <= right) {
    // Avoid overflow: same as (left + right) / 2
    int mid = left + (right - left) / 2;
    
    if (nums[mid] == target) return mid;
    if (nums[mid] < target) {
        left = mid + 1;
    } else {
        right = mid - 1;
    }
}