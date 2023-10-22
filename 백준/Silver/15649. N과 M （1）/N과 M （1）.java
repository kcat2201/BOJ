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
        num15649(1);
        System.out.println(sb.toString());
    }


    static void num15649(int level) {
        if (level == depth + 1) {
            for (int i = 1; i < selected.length; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");

        } else {
            for (int i = 1; i <= N; i++) {
                if (!checked[i]) {
                    selected[level] = i;
                    checked[i] = true;
                    num15649(level + 1);
                    checked[i] = false;
                }
            }
        }
    }
}
