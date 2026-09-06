public class NumberRecentcall933 {
    class RecentCounter {

        int[] queue;
        int front;
        int rear;

        public RecentCounter() {
            queue = new int[10000];
            front = 0;
            rear = 0;
        }

        public int ping(int t) {

            queue[rear++] = t;

            while (queue[front] < t - 3000) {
                front++;
            }

            return rear - front;
        }
    }
}
