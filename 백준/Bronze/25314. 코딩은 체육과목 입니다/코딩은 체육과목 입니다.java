import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        sb.append("int");

        int count = N / 4;
        for (int i = 0; i < count; i++) sb.insert(0, "long ");
        System.out.println(sb.toString());
    }
}


