

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] arr = nums.clone();
        Arrays.sort(arr);

        int n = nums.length;
        int start = 0, end = n - 1;

        while (start < n && nums[start] == arr[start]) {
            start++;
        }

        while (end >= 0 && nums[end] == arr[end]) {
            end--;
        }

        return start >= end ? 0 : end - start + 1;
    }
}
