
/*

/* 
// import java.util.*;
public class arrays {
    public static void main(String args[]){
        /* //creation of array 
        int array[]=new int[50];
        int array2[]={1,3,8};
        */
        /* 
        //operation on array
        int arr[]=new int[50];
        try(Scanner sc=new Scanner(System.in)){
        arr[0]=sc.nextInt();
        arr[1]=sc.nextInt();
        arr[2]=sc.nextInt();
        arr[3]=sc.nextInt();
        arr[4]=sc.nextInt();
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        } 
    }
}*/
import java.util.*;
public class arr2{

    // Linear search
    public static int check(String []arr,String key){
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(key)){
                return i;
            }
        }
        return -1;
    }
    // largest number
    public static int largenum(int num[]){
        int largest=Integer.MIN_VALUE;//-infinity
        for(int i=0;i<num.length;i++){
            if(largest<num[i]){
                largest=num[i];
            }       
        }
        return largest;
    }

    public static void main(String[] args) {

        // linear search in the String array
        System.out.println("Good Morning Sir/Madam !I hope You Enjoy the Hackathon.....");
        try(Scanner sc=new Scanner(System.in)){
            String name[]={"Dhruv","Aman","Muskan","Ram","Ravi"};        
            System.out.print("Enter your name:");
            String key=sc.next();
            int index=check(name, key);
            if(index==-1){
                System.out.println("Sorry!Good luck for the future!");
            }else{
                index += 1;
                System.out.println("Congrulations!You made it on "+index+"th place in Hackathon...");
            }


            // largest number in the intger array
            System.out.println("FINDING THE LARGEST NUMBER IN THE ARRAY");
            System.out.print("Enter the first element of array:");
            int first=sc.nextInt();
            
            System.out.print("Enter the second element of array:");
            int second=sc.nextInt();
            
            System.out.print("Enter the third element of array:");
            int third=sc.nextInt();
            
            System.out.print("Enter the fourth element of array:");
            int fourth=sc.nextInt();
            
            System.out.print("Enter the fifth element of array:");
            int fifth=sc.nextInt();

            int arr[]={first,second,third,fourth,fifth};
            System.out.println("arr= "+Arrays.toString(arr));

            System.out.println("largest value int the array is :"+largenum(arr));
            
        }
    }
}

/* 
// Binary Search
// pre required =sorted array
// process=arr hota in sorted format ,we find mid then we check key is less or grater 
// if key is less then check left otherwise right then again same 
public class arr2{
    public static int binarySearch(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public  static void main(String args[]){
        int num[]={2,4,6,8,10,12,14};
        int key=10;  
        System.out.println("index for key is:"+binarySearch(num, key));  
    }
}
*/

// Reverse the array
/* 
public class arr2{
    public static void revarr(int arr[]){
        int first=0;
        int last=arr.length-1;
        
        while(first<last){
            int temp=arr[last];
            arr[last]=arr[first];
            arr[first]=temp;

            first++;
            last--;

        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        revarr(arr);
        for (int i= 0; i < arr.length; i++) {
            System.out.print(arr[i]+"");
            
        }
            System.out.println();
    }
}
*/

/*
// Pairs in Array
// arr=2,4,6,8,10=(2,4) (2,6) (2,8) (2,10)......
// **Totalpairs=n(n-1)/2 nikalte hai
public class arr2{
    public static void pairsarr(int numbers[]){
        int tp=0;
        for(int i=0;i<numbers.length;i++){
            int curr=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+curr+","+numbers[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs:"+tp);
    }
    public static void main (String[] args){
        int arr[]={2,4,6,8,10,3};
        pairsarr(arr);
    }
}


// Print Subarrays=a continous part of array
// arr=2,4,6,8,10
// if n is array then n(n+1)/2 sub array hote
public class arr2{
    public static void Subarrays(int arr[]){
        int tp=0;
        for(int i=0;i<arr.length;i++){
            int curr=i;
            for(int j=i;j<arr.length;j++){ 
                int end=j;
                for(int k=curr;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                tp++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Pairs:"+tp);
    }
    public static void main (String[] args){
        int arr[]={2,4,6,8,10};
        Subarrays(arr);
    }
}
    */