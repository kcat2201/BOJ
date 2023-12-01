import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int num = sc.nextInt();
        int number = 2;
        while (true) {
            if (num == 1) {
                break;
            } else if (num % number == 0) {
                num = num / number;
                sb.append(number + "\n");
            } else number += 1;
        }
        System.out.println(sb);
    }

}