import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int N = sc.nextInt();
        Map<String, Integer> files = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String fileName = sc.next();
            String ext = fileName.substring(fileName.indexOf(".") + 1);
            if (files.containsKey(ext)) {
                files.replace(ext, files.get(ext) + 1);
            } else
                files.put(ext, 1);
        }
        List<String> keys=files.keySet().stream().collect(Collectors.toList());
        Collections.sort(keys);
        for(String ext : keys)
            sb.append(ext).append(" ").append(files.get(ext)).append("\n");
        System.out.println(sb.toString());
        /*
        icpc 2
        spc 2
        txt 3
        world 1
         */
    }
}
