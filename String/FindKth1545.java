package String;

// LeetCode 1545: Find Kth Bit in Nth Binary String
public class FindKth1545 {

    public char findKthBit(int n, int k) {
        if (n == 1) return '0';
        int len = (1 << n) - 1; // length of Sn
        int mid = len / 2 + 1;

        if (k == mid) return '1';
        if (k < mid) return findKthBit(n - 1, k);

        // k > mid: it's the inverted + reversed part
        char c = findKthBit(n - 1, len - k + 1);
        return c == '0' ? '1' : '0';
    }
}
