import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static int basket[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> res = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int N = sc.nextInt();
            res.add(N%42);
        }
        System.out.println(res.size());

    }

}


