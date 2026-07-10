package String;

public class Numberway1573 {
    
     

    public int numWays(String s) {

        int MOD = 1000000007;
        int ones = 0;

        // Count total ones
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ones++;
            }
        }

        // Special case: all zeros
        if (ones == 0) {
            long n = s.length() - 1;
            return (int) ((n * (n - 1) / 2) % MOD);
        }

        // Not divisible by 3
        if (ones % 3 != 0) {
            return 0;
        }

        int target = ones / 3;

        long firstCut = 0;
        long secondCut = 0;

        int seen = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '1') {
                seen++;
            }

            // Count possible first cuts
            if (seen == target && i + 1 < s.length() && s.charAt(i + 1) == '0') {
                firstCut++;
            }

            // Count possible second cuts
            if (seen == 2 * target && i + 1 < s.length() && s.charAt(i + 1) == '0') {
                secondCut++;
            }
        }

        // +1 because cut can be immediately after the target-th 1
        firstCut++;
        secondCut++;

        return (int) ((firstCut * secondCut) % MOD);
    }
}
 
