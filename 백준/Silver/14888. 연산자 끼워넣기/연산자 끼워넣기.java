import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//연산자 끼워넣기
public class Main {
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    static List<Integer> candidates;
    static int[] opts;
    static boolean[] used;
    static List<Integer> number;
    static int init;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        number = new ArrayList<>();
        sb = new StringBuilder();
        N = sc.nextInt();
        //더하기 빼기 나누기 곱하기 = 1 2 3 4
        candidates = new ArrayList<>();
        used = new boolean[N - 1];
        for (int i = 0; i < N; i++) {
            int M = sc.nextInt();
            number.add(M);
        }
        for (int i = 0; i < 4; i++) {
            int C = sc.nextInt();
            if (C > 0) {
                for(int j=0;j<C;j++){
                switch (i) {
                    case 0:
                        candidates.add(1);
                        break;
                    case 1:
                        candidates.add(2);
                        break;
                    case 2:
                        candidates.add(3);
                        break;
                    case 3:
                        candidates.add(4);
                        break;
                }
                }
            }
        }
        opts = new int[N];
        makeOrder(1);
        System.out.printf("%d\n%d",max,min);
    }


    static void makeOrder(int depth) {
        if (depth == N) {
                readyCalc();
        } else {
            for (int i = 0; i < N-1; i++) {
                if (!used[i]) {
                    opts[depth] = candidates.get(i);
                    used[i] = true;
                    makeOrder(depth + 1);
                    used[i] = false;
                }
            }
        }
    }

    private static void readyCalc() {
            init=calc(number.get(0), opts[1], number.get(1));
            for (int i=1;i<opts.length-1;i++) {
                init=calc(init, opts[i+1], number.get(i+1));
            }
            max=Math.max(max,init);
            min=Math.min(min,init);
    }

    private static int calc(int n1, int op, int n2) {
        if (op == 1) return n1 + n2;
        else if (op == 2) return n1 - n2;
        else if (op == 3) return n1 * n2;
        else return n1 / n2;

    }
}
