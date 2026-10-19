class Solution {
    public String reversePrefix(String word, int k) {

        k--;
        char[] arr = word.toCharArray();

        int left = 0;
        int right = k;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }
}