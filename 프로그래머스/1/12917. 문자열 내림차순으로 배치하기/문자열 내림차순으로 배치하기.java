import java.util.*;


class Solution {
    public String solution(String s) {
      String[] strings=s.split("");
        Arrays.sort(strings, Collections.reverseOrder());
        StringBuilder sb=new StringBuilder();
        for (String string : strings) {
            sb.append(string);
        }
        return sb.toString();
    }
}