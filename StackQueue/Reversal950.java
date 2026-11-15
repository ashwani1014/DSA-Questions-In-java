import java.util.*;

class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < deck.length; i++) {
            q.offer(i);
        }

        int[] ans = new int[deck.length];

        for (int num : deck) {
            ans[q.poll()] = num;

            if (!q.isEmpty()) {
                q.offer(q.poll());
            }
        }

        return ans;
    }
}
