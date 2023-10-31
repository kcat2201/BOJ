import java.util.*;

//부분 수열의 합
public class Main {
    static int N; //정수 개수
    static int S; //합
    static StringBuilder sb = new StringBuilder();
    static int[] numbers;
    static int[] selected;
    static boolean[] used;
    static int result = 0;

    //부분수열, 부분조합
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S = sc.nextInt(); //sum
        numbers = new int[N];

        for (int i = 0; i < N; i++)
            numbers[i] = sc.nextInt();
        selected = new int[N + 1];
        used = new boolean[N];

        for (int i = 1; i <= N; i++)
            makeSubSum(1, i, 0);

        System.out.println(result);
    }

    //5 0 -7 -3 -2 5 8
    static void makeSubSum(int level, int count, int start) {
        if (level == count + 1) {
            if (Arrays.stream(selected).sum() == S) result++;
            for (int i = 1; i <= count; i++) {
                sb.append(selected[i] + " ");
            }
            sb.append("\n");
        } else {
            for (int i = start; i < N; i++) {
                if (!used[i]) {
                    selected[level] = numbers[i];
                    used[i] = true;
                    start += 1;
                    makeSubSum(level + 1, count, start);
                    used[i] = false;
                }
            }
        }
    }
}

