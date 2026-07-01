package String;

public class JumpGame1871 {
    
 

    public boolean canReach(String s, int minJump, int maxJump) {
        return dfs(0, s, minJump, maxJump);
    }

    boolean dfs(int index, String s, int minJump, int maxJump) {

        if (index == s.length() - 1) {
            return true;
        }

        for (int i = index + minJump;
             i <= Math.min(index + maxJump, s.length() - 1);
             i++) {

            if (s.charAt(i) == '0') {
                if (dfs(i, s, minJump, maxJump)) {
                    return true;
                }
            }
        }

        return false;
    
}
}
