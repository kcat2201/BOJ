import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            String str = sc.next();
            Recur re=new Recur(str);
            sb.append(re.isPalindrome(str)).append(" ").append(re.getCount()).append("\n");
        }
        System.out.println(sb);
    }

    static class Recur {
        String str;
        int count;

        public Recur(String str) {
            this.str = str;
            this.count=0;
        }

        public int getCount() {
            return count;
        }

        public int recursion(String s, int l, int r) {
            this.count=getCount()+1;
            if (l >= r) return 1;
            else if (s.charAt(l) != s.charAt(r)) return 0;
            else return recursion(s, l + 1, r - 1);
        }

        public int isPalindrome(String s) {
            return recursion(s, 0, s.length() - 1);
        }
    }
}