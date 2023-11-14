import java.io.IOException;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num == 0)
                stack.pop();
            else stack.add(num);
        }
        AtomicInteger sum = new AtomicInteger();
        stack.forEach(s -> {
            sum.addAndGet(s);
        });
        System.out.println(sum.get());
    }
}
