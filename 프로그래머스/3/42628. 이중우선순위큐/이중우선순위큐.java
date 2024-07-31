import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
          PriorityQueue<Integer> queue = new PriorityQueue<>();
//        String[] operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};

        for (String operation : operations) {
           if (operation.equals("D 1")) {
                if (queue.size() > 0) {
                    int get = queue.stream().sorted(Collections.reverseOrder()).findFirst().get();
                    queue.remove(get);
                }
            } else if (operation.equals("D -1")) {
                //최소값 삭제
                if (queue.size() > 0) {
                    queue.poll();
                }
            } else {
                //삽입
                operation = operation.trim().replace("I", "").trim();
                queue.add(Integer.valueOf(operation));
            }
        }

        int min = 0;
        int max = 0;
        if (!queue.isEmpty()) {
            min = queue.peek();
            max = queue.stream().sorted(Collections.reverseOrder()).findFirst().get();
        }
        answer[0] = max;
        answer[1] = min;
        
        return answer;
    }
}