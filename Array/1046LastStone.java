class Solution {
    public int lastStoneWeight(int[] stones) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int stone : stones) {
            list.add(stone);
        }

        while (list.size() > 1) {

            Collections.sort(list);

            int y = list.remove(list.size() - 1); // largest
            int x = list.remove(list.size() - 1); // second largest

            if (x != y) {
                list.add(y - x);
            }
        }

        return list.size() == 0 ? 0 : list.get(0);
    }
}