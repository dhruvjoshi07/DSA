/* 
// Shopping price java
package que;

public class sp {
    public class Shopping {
    public static void main(String[] args) {
        int[] prices = {120, 250, 75, 300, 90, 150};

        int total = 0;
        int max = prices[0];
        int min = prices[0];

        for (int i = 0; i < prices.length; i++) {
            total += prices[i];

            if (prices[i] > max) {
                max = prices[i];
            }

            if (prices[i] < min) {
                min = prices[i];
            }
        }

        System.out.println("Total Bill: " + total);
        System.out.println("Most Expensive Item: " + max);
        System.out.println("Cheapest Item: " + min);
    }
}

}
*/
public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Array elements are:");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}