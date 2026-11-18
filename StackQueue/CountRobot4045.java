
class Solution {
    public int countGroups(int[] position, int[] speed, int distance) {
        int n = position.length;
        int groups = 1;

        double time = 0;

        for (int i = n - 2; i >= 0; i--) {

            if (speed[i] <= speed[i + 1]) {
                groups++;
                time = 0;
            } else {
                double t = (double) (position[i + 1] - position[i])
                        / (speed[i] - speed[i + 1]);

                if (t <= distance) {
                    time = Math.max(time, t);
                } else {
                    groups++;
                    time = 0;
                }
            }
        }

        return groups;
    }
}
