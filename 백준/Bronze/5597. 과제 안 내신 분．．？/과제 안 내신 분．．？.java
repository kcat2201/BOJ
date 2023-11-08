import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<Integer> check = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
                16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30));
        List<Integer> scores = new ArrayList<>();
        for (int i = 0; i < 28; i++) {
            int score = Integer.parseInt(bf.readLine());
            scores.add(score);
        }
        check.removeAll(scores);
        for(int i=0;i<check.size();i++){
            sb.append(check.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}
