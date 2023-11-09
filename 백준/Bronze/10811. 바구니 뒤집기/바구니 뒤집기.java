import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<Integer> bsk = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            bsk.add(i);
        }
        for (int i = 0; i < M; i++) {
            int start = sc.nextInt()-1;
            int end = sc.nextInt();
            if (start != end) {
                List<Integer> list = bsk.subList(start, end);
                Collections.reverse(list);
                for(int l=0;l<list.size();l++){
                    bsk.set(start+l,list.get(l));
                }
            }
        }

        for(int i=0;i<bsk.size();i++)
            result.append(bsk.get(i)).append(" ");

        System.out.println(result);
    }
}
