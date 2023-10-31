import java.util.*;

public class Main {
    static int N;
    static long maxKey;
    static int maxValue=0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        Map<Long, Integer> count = new HashMap<>();
        for (int i = 0; i < N; i++) {
            Long num = sc.nextLong();
            if (count.containsKey(num))
                count.replace(num, count.get(num) + 1);
            else count.put(num, 1);
        }
        count.entrySet().forEach(
                kv->{
                    long k=kv.getKey();
                    int v=kv.getValue();
                    if(v>maxValue){
                        maxValue=v;
                        maxKey=k;
                    }else if(v==maxValue)
                    {
                            if(maxKey>k){
                                maxKey=k;
                            }
                    }
                }
        );
        System.out.println(maxKey);
    }
}
//5 1 2 1 2 1
//6 123 321 123 321 5 5
//2 1 2