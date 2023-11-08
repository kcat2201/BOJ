import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String word=sc.next();
        String alph="abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<alph.length();i++){
            sb.append(word.indexOf(alph.charAt(i))).append(" ");
        }
        System.out.println(sb);
    }
}
