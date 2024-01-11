import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int MAX = 1000000;
        boolean numbers[]=new boolean[MAX+1];
        numbers[0]=true;
        numbers[1]=true;

        for(int i=2;i<=Math.sqrt(MAX);i++){
            if(!numbers[i]){
                for(int j=i*i;j<=MAX;j+=i){
                    numbers[j]=true;
                }
            }
        }
        while(true) {
            int N = sc.nextInt();
            if (N == 0) break;
            boolean end=false;
            for (int a = 3; a <= N - a; a += 2) {
                if (!numbers[a] && !numbers[N - a]) {
                    sb.append(N + " = " + a + " + " + (N - a) + "\n");
                    end=true;
                    break;
                }
            }
            if(!end) sb.append("Goldbach's conjecture is wrong.\n");
        }
        System.out.println(sb);
    }
}