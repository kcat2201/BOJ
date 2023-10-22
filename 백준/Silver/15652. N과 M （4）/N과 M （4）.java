import java.util.Scanner;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int[] selected;
    static boolean[] checked;
    static int depth;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        int M = sc.nextInt();
        depth = M;
        selected = new int[M + 1];
        checked = new boolean[N + 1];
        num15652(1,1);
        System.out.println(sb.toString());
    }


    static void num15652(int level, int start) {
        if (level == depth + 1) {
            for (int i = 1; i < selected.length; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");

        } else {
            if (!checked[level]) {
                for (int i = start; i <= N; i++) {
                    selected[level] = i;
                    num15652(level + 1,selected[level]);
                }
            }

        }
    }
}
