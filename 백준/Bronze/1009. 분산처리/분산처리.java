import java.util.*;

public class Main {
    static Map<Integer, List<Integer>> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        map.put(2, List.of(2, 4, 8, 6));
        map.put(3, List.of(3, 9, 7, 1));
        map.put(4, List.of(4, 6));
        map.put(7, List.of(7, 9, 3, 1));
        map.put(8, List.of(8, 4, 2, 6));
        map.put(9, List.of(9, 1));
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            a %= 10; //일의 자리 추출
            int result = 0;
            switch (a) {
                case 0:
                    result = 10;
                    break;
                case 1:
                    result = 1;
                    break;
                case 5:
                    result = 5;
                    break;
                case 6:
                    result = 6;
                    break;
                default:
                    result = calc(a, b);
                    break;
            }
            sb.append(result + "\n");
        }
        System.out.println(sb);
    }

    private static int calc(int a, int b) {
        List list=map.get(a);
        int size=list.size();
        int div=(b-1)%size;
        return (int) list.get(div);
    }
}