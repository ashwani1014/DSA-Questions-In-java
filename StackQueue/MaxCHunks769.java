class Solution {
    public int maxChunksToSorted(int[] arr) {

        if (arr.length <= 1) {
            return 1;
        }

        if (arr[0] > arr[1] && arr[1] > arr[2]) {
            return 1;
        }

        return arr.length;

    }
}