import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(factorial(num));
    }

    static long factorial(int N) {
        if (N == 0) return 1;
        else return N * factorial(N - 1);
    }

}