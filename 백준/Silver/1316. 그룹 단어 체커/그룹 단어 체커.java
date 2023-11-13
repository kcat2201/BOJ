import java.io.IOException;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        AtomicInteger count = new AtomicInteger();
        List<Integer> list;
        for (int i = 0; i < N; i++) {
            String word = sc.nextLine();
            Map<String, List<Integer>> alphMap = new HashMap<>();
            String[] str = word.split("");
            for (int j = 0; j < str.length; j++) {
                if (alphMap.containsKey(str[j])) {
                    list = alphMap.get(str[j]);
                }else list=new ArrayList<>();
                list.add(j);
                alphMap.put(str[j], list);
            }
            AtomicBoolean check = new AtomicBoolean(true);
            alphMap.entrySet().forEach(e->{
                if(e.getValue().size()>1){
                    List<Integer> idx=e.getValue();
                    for(int k=1;k<idx.size();k++){
                        if(idx.get(k)-idx.get(k-1)!=1) {
                            check.set(false);
                            break;
                        }
                    }
                }
            });
            if(check.get()) count.getAndIncrement();
        }
        System.out.println(count);
    }
}
