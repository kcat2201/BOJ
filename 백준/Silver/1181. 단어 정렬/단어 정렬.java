import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        Map<String,Integer> str=new HashMap<>();
        for(int i=0;i<N;i++){
            String word=sc.next();
            if(!str.containsKey(word)) str.put(word,word.length());
        }
        str.entrySet().stream().sorted((o1, o2) -> {
            if(o1.getValue()==o2.getValue()){
                return o1.getKey().compareTo(o2.getKey());
            }
            return o1.getValue()-o2.getValue();
        }).forEach(
                entry-> System.out.println(entry.getKey())
        );
    }
}
