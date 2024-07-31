import java.util.ArrayList;
import java.util.List;

class Solution {
    
    static List<Integer> list = new ArrayList<>();
    static int[][] answer;
    static int index = 0;
    
    public int[][] solution(int n) {
        int size = (int) Math.pow(2, n) - 1;
        answer = new int[size][2];
        int start = 1;
        int via = 2;
        int dst = 3;

        hanoi(n, start, dst, via);
        for (int i = 0; i < list.size(); i += 2) {
            int[] in = new int[2];
            in[0] = list.get(i);
            in[1] = list.get(i + 1);
           answer[index]=in;
           index++;
        }


        return answer;
    }
    
      private static void hanoi(int n, int start, int dst, int via) {
        if (n <= 1)
            move(1, start, dst);
        else {
            hanoi(n - 1, start, via, dst);
            move(n, start, dst);
            hanoi(n - 1, via, dst, start);
        }
    }

    private static void move(int n, int start, int dst) {

        list.add(start);
        list.add(dst);
    }

}