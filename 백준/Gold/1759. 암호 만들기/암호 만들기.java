import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//암호 만들기
//4 6 a t c i s w => a, c, i, s, t, w
//최소 한 개의 모음(a, e, i, o, u)과 최소 두 개의 자음
public class Main {
    static String[] candis;
    static String[] selected;
    static boolean[] checked;
    static int L; //암호 길이
    static int C; //char 개수
    static StringBuilder sb = new StringBuilder();
    static List<String> aeiou = List.of("a", "e", "i", "o", "u");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        L = sc.nextInt();
        C = sc.nextInt();
        candis = new String[C + 1];
        selected = new String[L + 1];
        checked = new boolean[C + 1];
        candis[0] = "0";
        for (int i = 1; i <= C; i++) {
            candis[i] = sc.next();
        }
        Arrays.sort(candis);
        num1759(1, 1);
        System.out.println(sb.toString());
    }

    static void num1759(int depth, int start) {

        if (depth == L + 1) {
            int mo = 0, za = 0;
            StringBuilder inner = new StringBuilder();
            for (int i = 1; i < selected.length; i++) {
                if (aeiou.indexOf(selected[i]) >= 0) {
                    mo++;
                } else {
                    za++;
                }
                inner.append(selected[i]);
            }
            if (mo >= 1 && za >= 2) sb.append(inner + "\n");
        } else {
            for (int i = start; i < candis.length; i++) {
                selected[depth] = candis[i];
                start += 1;
                num1759(depth + 1, start);
            }
        }
    }
}

