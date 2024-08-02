import java.util.*;

class Solution {
    public int solution(int[] citations) {
            int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < citations.length; i++) {
            list.add(citations[i]);
        }
        Collections.sort(list, Collections.reverseOrder());
        int index = (list.size() - 1) / 2;
        int stand = list.get(index);

        while (answer >= 0) {
            long count = list.stream().filter(c -> c >= stand).count();
            long count2 = list.stream().filter(c -> c <= stand).count();
            if (count >= stand && count2 <= stand) {
                answer = stand;
                break;
            } else {
                answer -= 1;
            }
        }
        return answer+1;
    }
}