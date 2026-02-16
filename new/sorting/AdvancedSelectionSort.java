package sorting;
public class AdvancedSelectionSort {

    public static void selectionSortMinMax(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int minIndex = left;
            int maxIndex = left;

            // Find minimum and maximum in one loop
            for (int i = left; i <= right; i++) {
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
                if (arr[i] > arr[maxIndex]) {
                    maxIndex = i;
                }
            }

            // Swap minimum with left
            int temp = arr[left];
            arr[left] = arr[minIndex];
            arr[minIndex] = temp;

            // If max element was at left, update its index
            if (maxIndex == left) {
                maxIndex = minIndex;
            }

            // Swap maximum with right
            temp = arr[right];
            arr[right] = arr[maxIndex];
            arr[maxIndex] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {64, 25, 12, 22, 11, 90, 5};

        selectionSortMinMax(arr);

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

public class ProductPriceSort {

    public static void advancedSelectionSort(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int minIndex = left;
            int maxIndex = left;

            for (int i = left; i <= right; i++) {
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
                if (arr[i] > arr[maxIndex]) {
                    maxIndex = i;
                }
            }

            // Swap minimum to left
            int temp = arr[left];
            arr[left] = arr[minIndex];
            arr[minIndex] = temp;

            if (maxIndex == left) {
                maxIndex = minIndex;
            }

            // Swap maximum to right
            temp = arr[right];
            arr[right] = arr[maxIndex];
            arr[maxIndex] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[] prices = {4999, 1999, 9999, 2999, 1499, 7999};

        advancedSelectionSort(prices);

        System.out.println("Sorted Prices:");
        for (int price : prices) {
            System.out.print(price + " ");
        }
    }
}

