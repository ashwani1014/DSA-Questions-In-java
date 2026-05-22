class Solution {

    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

        // check for first occurrence
        ans[0] = search(nums, target, true);

        // check for last occurrence
        ans[1] = search(nums, target, false);

        return ans;
    }

    int search(int[] nums, int target, boolean findStartIndex) {

        int ans = -1;

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            }

            else if (target > nums[mid]) {
                start = mid + 1;
            }

            else {

                // potential answer found
                ans = mid;

                if (findStartIndex) {
                    end = mid - 1;
                }

                else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}


 