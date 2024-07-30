import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
             int[] answer;
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            int mod = (100 - progresses[i]) % speeds[i];
            int div = (100 - progresses[i]) / speeds[i];
            queue.add(mod > 0 ? div + 1 : div);
        }

        List<Integer> list = new ArrayList<>();
        int count = 1;
        int day = queue.poll();
        while (!queue.isEmpty()) {
            int poll = queue.poll();
            if (poll <= day) {
                count += 1;
            } else {
                list.add(count);
                count = 1;
                day = poll > day ? poll : day;
            }

            if(queue.size()==0){
                list.add(count);
            }
        }
        answer = new int[list.size()];

        for (int j = 0; j < list.size(); j++)
            answer[j] = list.get(j);
        return answer;
    }
}