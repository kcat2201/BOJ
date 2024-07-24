import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
      
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String o11 = o1.substring(n, n + 1);
                String o22 = o2.substring(n, n + 1);
                 if(o11.equals(o22))
                  return o1.compareTo(o2);
                return o11.compareTo(o22);
            }
        });
        
        return strings;
    }
}