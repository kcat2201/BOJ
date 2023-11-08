import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<T;i++)
        {
            String str=bf.readLine();
            sb.append(str.charAt(0) +String.valueOf(str.charAt(str.length()-1))).append("\n");
         }
        System.out.println(sb);
    }
}
