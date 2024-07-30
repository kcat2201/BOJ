import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
  PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i : scoville) {
            queue.add(Integer.valueOf(i));
        }

        int i = 0;
        int q1 = queue.peek();
        if (q1 >= K)
            return 0;

        while (queue.size() > 1) {
            q1 = queue.poll();
            int q2 = queue.poll();
            queue.add(q1 + 2 * q2);
            i++;

           if (queue.peek() >= K) {
                return i;
            }
        }
        return -1;
    }
    
    
}