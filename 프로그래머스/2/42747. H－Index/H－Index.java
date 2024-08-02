import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int solution(int[] citations) {
               List<Integer> list = new ArrayList<>();
        for (int i = 0; i < citations.length; i++) {
            list.add(citations[i]);
        }

        Collections.sort(list, Collections.reverseOrder());
        int answer = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) <= i ) {
                answer = i;
                break;
            }
        }
        if (answer == 0) {
            answer = list.size();
        }
        
         if (list.get(0) == 0)
            return 0;
        return answer;
    }
}