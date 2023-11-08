import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb=new StringBuilder();
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            nums.add(sc.nextInt());
        }
        Collections.sort(nums);
        for (int i = 0; i < nums.size(); i++) {
            sb.append(nums.get(i)+"\n");
        }
        System.out.println(sb);
    }
}
