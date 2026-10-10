
class Solution {

    public int findRadius(int[] houses, int[] heaters) {

        Arrays.sort(houses);
        Arrays.sort(heaters);

        int i = 0;
        int j = 0;

        int minRadius = 0;

        while (i < houses.length) {

            while (j < heaters.length - 1
                    && Math.abs(houses[i] - heaters[j]) >= Math.abs(houses[i] - heaters[j + 1])) {
                j++;
            }

            minRadius = Math.max(minRadius, Math.abs(houses[i] - heaters[j]));
            i++;
        }

        return minRadius;
    }
}
