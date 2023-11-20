import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        String line;
        List<String> mu=List.of("a","e","i","o","u");
        while(!(line=sc.nextLine()).equals("#")){
            line=line.toLowerCase();
            AtomicInteger count= new AtomicInteger();
            Arrays.stream(line.split("")).forEach(
                    ch -> {
                        if(mu.contains(ch)) count.getAndIncrement();
                    }
            );
            sb.append(count.get()).append("\n");
        }
        System.out.println(sb);
    }
}
