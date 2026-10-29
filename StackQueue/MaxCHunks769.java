class Solution {
    public int maxChunksToSorted(int[] arr) {

        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        boolean isSorted = Arrays.equals(arr, sorted);

        if (!isSorted) {
            return 1;
        }

        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (!stack.isEmpty() && arr[i] < stack.peek()) {
                stack.pop();
                count++;
            } else {
                
                count++;
            }
             stack.push(arr[i]);
        }

        return count;
    }
}