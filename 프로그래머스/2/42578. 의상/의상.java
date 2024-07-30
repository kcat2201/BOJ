import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

class Solution {
    public int solution(String[][] clothes) {
    
             AtomicInteger answer = new AtomicInteger(1);
        Map<String, Integer> map = new HashMap<>();

        for (String[] clothe : clothes) {
            String key = clothe[1];
            int count = 0;
            if (map.containsKey(key)) {
                count = map.get(key);
            }
            map.put(key, count + 1);

        }

        map.values().forEach(
                v -> {
                    answer.updateAndGet(v1 -> v1 * (v + 1));
                }
        );
        
        return answer.get()-1;

    }
}