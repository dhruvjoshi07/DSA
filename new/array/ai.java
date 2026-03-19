//question practice from chatgpt
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n; 
        
        // 1. Reverse the whole thing: [5,4,3,2,1]
        reverse(nums, 0, n - 1);
        // 2. Reverse the first k: [4,5,3,2,1]
        reverse(nums, 0, k - 1);
        // 3. Reverse the rest: [4,5,1,2,3]
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}