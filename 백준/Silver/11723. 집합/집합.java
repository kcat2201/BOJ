import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//11723
public class Main {

    static int S[];
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sb = new StringBuilder();

        S = new int[21];
        for (int i = 1; i <= N; i++) {
            String cmd = sc.next();
            if (cmd.equals("empty") || cmd.equals("all")) {
                checkCommand(new Command(cmd,0));
            } else {
                checkCommand(new Command(cmd,sc.nextInt()));
            }
        }
        System.out.println(sb.toString());

    }

    static void checkCommand(Command cmd) {
        switch (cmd.cmd) {
            case "add":
                if (S[cmd.num] == 0)
                    S[cmd.num] = cmd.num;
                break;
            case "remove":
                if (S[cmd.num] != 0)
                    S[cmd.num] = 0;
                break;
            case "check":
                if (S[cmd.num] != 0)
                    sb.append("1\n");
                else sb.append("0\n");
                break;
            case "toggle":
                if (S[cmd.num] != 0)
                    S[cmd.num] = 0;
                else S[cmd.num] = cmd.num;
                break;
            case "all":
                for (int i = 1; i <= 20; i++)
                    S[i] = i;
                break;
            case "empty":
                Arrays.fill(S, cmd.num);
                break;
        }
    }

    static class Command {
        String cmd;
        int num;

        Command(String cmd, int num) {
            this.cmd = cmd;
            this.num = num;
        }

        @Override
        public String toString() {
            return "Command{" +
                    "cmd='" + cmd + '\'' +
                    ", num=" + num +
                    '}';
        }
    }


}
