class Solution {
    public long maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int maxSoFar = Integer.MIN_VALUE;
        int minSoFar = Integer.MAX_VALUE;
        int currentMax = 0;
        int currentMin = 0;

        for (int x : nums) {
            totalSum += x;

            currentMax += x;
            if (currentMax > maxSoFar) {
                maxSoFar = currentMax;
            }
            if (currentMax < 0) {
                currentMax = 0;
            }

            currentMin += x;
            if (currentMin < minSoFar) {
                minSoFar = currentMin;
            }
            if (currentMin > 0) {
                currentMin = 0;
            }
        }

        if (maxSoFar < 0) {
            return (long) maxSoFar;
        }

        return Math.max(maxSoFar, totalSum - minSoFar);
    }
}
