package array;
// index se end tak ke saare sum of add krte hue prefix array mei dalte rho
/*prefix[end]-prefix[start-1]
prefix[i-1]+arr[i]*/
import java.util.*;
public class prefixsum {
    public static void MaxSum(int arr[],int size){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefixSum[]=new int[size];

        //already declare first element
        prefixSum[0]=arr[0];

        //yaha pr hamne prefix array mei value daali array se
        for(int i =1;i<size;i++){
            prefixSum[i]=prefixSum[i-1]+arr[i];
        }
        
        //normal loop for subarray
        for(int i=0;i<size;i++){
            int start=i;
            for(int j=i;j<size;j++){
                int end=j;

                //yaha pr hamne pehla subarray start seedha agar 0 hai toh hamne sedha end nikal diya
                currSum=start==0?prefixSum[end]:prefixSum[end]-prefixSum[start-1];

                //compare
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Maxsum= "+maxSum);
    }
    public static void main(String[] args){
        try(Scanner sc= new Scanner(System.in)){
            int arr[]=new int[50];
            int size=5;

            System.out.println("Enter the array elements:");

            //lets take the input values from the user
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }

            //calling  function
            MaxSum(arr,size);
        }
    }
}
//time complexity=0(n^2)