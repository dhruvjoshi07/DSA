package sorting;
/*public class bubblesort {
    public static void sort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
    }
    /*Bubble sort=5,4,1,3,2
 5 ko her kisi se compare kra and we got
 4 1 3 2 5
 now 4 se compare
 1 3 2 4 5
 now 3 ko compare
 1 2 3 4 5
 we see now arr is sorted
logic:
for(i=0 to n-2)
    for(j=0 to n-2-i)

    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String [] args){
            int arr[]={5,4,1,3,2};
            sort(arr);
            printarr(arr);
    }
}
 */

// -----Advanced way---
import java.util.Comparator;

public class AdvancedSorter {

    /**
     * An optimized, generic Bubble Sort.
     * @param array The array to be sorted
     * @param comparator The logic used to compare two elements
     */
    public static <T> void bubbleSort(T[] array, Comparator<? super T> comparator) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                // Use the comparator for flexible sorting logic
                if (comparator.compare(array[j], array[j + 1]) > 0) {
                    swap(array, j, j + 1);
                    swapped = true;
                }
            }
            // Optimization: If no elements were swapped, the array is sorted
            if (!swapped) break;
        }
    }

    private static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        // Example 1: Sorting Strings by length using a Lambda
        String[] words = {"Apple", "Pie", "Banana", "Kiwi"};
        bubbleSort(words, (a, b) -> Integer.compare(a.length(), b.length()));
        
    }
}