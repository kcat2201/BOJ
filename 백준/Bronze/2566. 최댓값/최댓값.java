import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int r = 0, c = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int num = sc.nextInt();
                if (num > max) {
                    max = num;
                    r = i + 1;
                    c = j + 1;
                }
            }
        }
        sb.append(max+"\n");
        sb.append(r+" "+c+"\n");
        System.out.println(sb);
    }
}
