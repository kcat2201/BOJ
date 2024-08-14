import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();
        for (String s : keymap) {
            char[] keys = s.toCharArray();
            for (int i = 0; i < keys.length; i++) {
                if (map.containsKey(keys[i])) {
                    int get = map.get(keys[i]);
                    if (i + 1 < get) {
                        map.put(keys[i], i + 1);
                    }
                } else {
                    map.put(keys[i], i + 1);
                }
            }
        }

        int count = 0;
        for (int j = 0; j < targets.length; j++) {
            char[] t = targets[j].toCharArray();
            for (int i = 0; i < t.length; i++) {
                if (map.containsKey(t[i])) {
                    count+=map.get(t[i]);
                } else {
                    count = -1;
                    break;
                }
            }
            answer[j]=count;
            count=0;
        }

        return answer;

    }
}