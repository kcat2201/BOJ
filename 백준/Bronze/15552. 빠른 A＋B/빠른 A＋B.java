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
            String num[]=str.split(" ");
            sb.append(Integer.parseInt(num[0])+Integer.parseInt(num[1])).append("\n");
         }
        System.out.println(sb);
    }
}
