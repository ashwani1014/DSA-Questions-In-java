class Solution {
    public int maxSum(int[] nums1, int[] nums2) {
        long s1 = 0, s2 = 0;
        int m = nums1.length;
        int n = nums2.length;
        int i1 = 0, i2 = 0;
        long max = 0;

        while (i1 != m && i2 != n) {
            if (nums1[i1] < nums2[i2]) {
                s1 += nums1[i1];
                i1++;
            } else if (nums2[i2] < nums1[i1]) {
                s2 += nums2[i2];
                i2++;
            } else if (nums1[i1] == nums2[i2]) {
                max += Math.max(s1, s2) + nums1[i1];
                s1 = 0;
                s2 = 0;
                i1++;
                i2++;
            }
        }
        while (i1 != m) {
            s1 += nums1[i1];
            i1++;
        }
        while (i2 != n) {
            s2 += nums2[i2];
            i2++;
        }
        max += Math.max(s1, s2);

        return ((int) (max % 1000000007));
    }
}