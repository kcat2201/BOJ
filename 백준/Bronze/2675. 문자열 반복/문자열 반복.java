import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<T;i++){
            int num=sc.nextInt();
            String str=sc.next();
            String[] strs=str.split("");
            for(int j=0;j<strs.length;j++)
                for(int k=0;k<num;k++)
                    sb.append(strs[j]);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
