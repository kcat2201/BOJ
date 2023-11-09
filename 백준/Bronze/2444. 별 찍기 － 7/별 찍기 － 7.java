import java.io.IOException;
import java.util.*;

public class Main {

    static int N;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        N = sc.nextInt(); 
        for (int i = 1; i <= 2 * N - 1; i++) {
            result.append(makeStars(i)).append("\n");
        }
        System.out.println(result);
    }

    private static String makeStars(int i) {
        int empty = Math.abs(N - i);
        int star = 2 * N - 2 * empty - 1;

        StringBuilder line = new StringBuilder();
        for (int e = 0; e < empty; e++)
            line.append(" ");
        for (int s = 0; s < star; s++)
            line.append("*");
        return line.toString();
    }
}
