import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(true){
            String str=sc.nextLine();
            if("0 0".equals(str))
                break;
            else{
                int sum= Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).sum();
                sb.append(sum).append("\n");
            }
        }
        System.out.println(sb);
    }
}