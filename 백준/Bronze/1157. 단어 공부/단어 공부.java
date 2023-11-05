import java.io.IOException;
import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static int S[];
    static StringBuilder sb = new StringBuilder();
    static int max=-1;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        word = word.toUpperCase();
        Map<String, Integer> cnt = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            String ch = word.substring(i, i + 1);
            if (cnt.containsKey(ch))
                cnt.replace(ch, cnt.get(ch) + 1);
            else cnt.put(ch, 1);
        }
        Optional<Integer> max=cnt.values().stream().max(Comparator.comparingInt(o -> o));
        int maxx= max.get().intValue();

        cnt.entrySet().forEach(
                ent->{
                    if(ent.getValue()==maxx){
                        sb.append(ent.getKey());
                    }
                }
        );
        if(sb.toString().length()>=2){
            System.out.println("?");
        }else
            System.out.println(sb.toString());
    }


}
