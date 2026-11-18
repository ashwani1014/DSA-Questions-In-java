
class Solution {
    public int countGroups(int[] position, int[] speed, int distance) {
        int n = position.length;

        int groups = 0;
        int rightSpeed = 0;
        boolean hasRightGroup = false;

        for (int i = n - 1; i >= 0; i--) {

            // Already merged at time t = 0
            if (i < n - 1 &&
                    position[i + 1] - position[i] <= distance) {
                continue;
            }

            // Create a new group if it cannot catch the right group
            if (!hasRightGroup || speed[i] <= rightSpeed) {
                groups++;
                rightSpeed = speed[i];
                hasRightGroup = true;
            }
            // Otherwise, it merges into the right group
        }

        return groups;
    }
}
