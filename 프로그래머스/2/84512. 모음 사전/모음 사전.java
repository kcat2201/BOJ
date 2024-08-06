import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int solution(String word) {
        int answer = 0;
         List<String> list = List.of("A", "E", "I", "O", "U");
        int[] index = {781, 156, 31, 6, 1};
         String[] words = word.split("");
        
        
            for (int i = 0; i < words.length; i++) {
            int total = index[i] * list.indexOf(words[i])+1;
            answer += total;
        }
        
        return answer;
    }
}