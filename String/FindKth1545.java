public class FindKth1545 {
    

    package String;

public class JumpGame1871 {

    private Boolean[] memo;

    public boolean canReach(String s, int minJump, int maxJump) {

        memo = new Boolean[s.length()];

        return dfs(0, s, minJump, maxJump);
    }

    private boolean dfs(int index, String s, int minJump, int maxJump) {

        if (index == s.length() - 1) {
            return true;
        }

        if (memo[index] != null) {
            return memo[index];
        }

        for (int i = index + minJump;
             i <= Math.min(index + maxJump, s.length() - 1);
             i++) {

            if (s.charAt(i) == '0') {

                if (dfs(i, s, minJump, maxJump)) {
                    memo[index] = true;
                    return true;
                }
            }
        }

        memo[index] = false;
        return false;
    }

    public static void main(String[] args) {

        JumpGame1871 obj = new JumpGame1871();

        String s = "011010";
        int minJump = 2;
        int maxJump = 3;

        System.out.println(obj.canReach(s, minJump, maxJump));
    }
}
}
