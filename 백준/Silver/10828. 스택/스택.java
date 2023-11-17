import java.io.IOException;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static Stack<Integer> stack;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            String cmd = sc.next();
            if (cmd.equals("push")) {
                int num = sc.nextInt();
                stack.push(num);
            } else {
                switch (cmd) {
                    case "top":
                        stackTop();
                        break;
                    case "size":
                        stackSize();
                        break;
                    case "empty":
                        stackEmpty();
                        break;
                    case "pop":
                        stackPop();
                        break;
                }
            }
        }
        System.out.println(sb.toString());
    }

    private static void stackPop() {
        if (stack.size() > 0) {
            int num = stack.pop();
            sb.append(num).append("\n");
        }else sb.append("-1\n");
    }

    private static void stackTop() {
        if (stack.size() > 0) {

            int num = stack.get(stack.size()-1);
            sb.append(num).append("\n");
        }else sb.append("-1\n");
    }

    static void stackSize() {
        sb.append(stack.size()).append("\n");
    }

    static void stackEmpty() {
        if (stack.size() > 0) sb.append("0\n");
        else sb.append("1\n");
    }
}
