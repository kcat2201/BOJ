import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        String[] index = new String[goal.length];
        Map<String, String> pre = new HashMap<>();
        List<String> c1 = List.of(cards1);
        List<String> c2 = List.of(cards2);
        
         if(c1.size()+c2.size()< goal.length){
            return "No";
        }
        for (int i = 0; i < goal.length; i++) {
            String str = goal[i];
            if (c1.contains(str)) {
                index[i] = c1.indexOf(str) + "a";
            } else {
                index[i] = c2.indexOf(str) + "b";
            }
        }

            for (int i = 0; i < index.length - 1; i++) {
                String idx1 = index[i].substring(0, 1);
                String idx2 = index[i + 1].substring(0, 1);
                String alp1 = index[i].substring(1);
                String alp2 = index[i + 1].substring(1);

                if (alp1.equals(alp2) && idx1.compareTo(idx2) < 0) {
                    if(idx1.compareTo(idx2)!=-1){
                    answer="No";
                }
                } else if (!alp1.equals(alp2)) {
                    //이전 문자열과 비교
                    if (pre.get(alp2) == null) {
                        pre.put(alp2, idx2);
                    } else {
                        String preIdx = pre.get(alp2);
                        if (preIdx.compareTo(idx2) > 0) {
                            answer = "No";
                        }
                    }
                } else {
                    answer = "No";
                    break;
                }
            }
        
        //카드를 사용하지 않고 다음 카드로 넘어갈 수 없습니다.
        return answer;
    }
}