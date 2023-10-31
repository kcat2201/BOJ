import java.util.*;

public class Main {

    static int N; //점 개수

    //CASE1 = 5 0 1 1 2 3 1 4 2 5 1
    //7 6 1 7 2 9 1 10 2 0 1 3 1 4 1
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        Map<Integer, List<Integer>> dots = new HashMap<>();
        //색깔, 점 list
        for (int i = 0; i < N; i++) {
            int dot = sc.nextInt();
            int color = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            if (dots.containsKey(color)) {
                list = dots.get(color);
            }
            list.add(dot);
            dots.put(color, list);
        }
        for (int key : dots.keySet()) {
            List<Integer> list = dots.get(key);
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) {
                if (i == list.size() - 1)
                    sum += Math.abs(list.get(list.size() - 1) - list.get(list.size() - 2));
                else {
                    if(i==0) sum += Math.abs(list.get(i) - list.get(i + 1));
                    else {
                        int min = Integer.MAX_VALUE;
                        int bef = Math.abs(list.get(i-1) - list.get(i));
                        int aft = Math.abs(list.get(i) - list.get(i+1));
                        min=bef>aft?aft:bef;
                        sum+=min;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
